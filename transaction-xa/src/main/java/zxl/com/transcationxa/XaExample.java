package zxl.com.transcationxa;

import com.mysql.jdbc.jdbc2.optional.MysqlXADataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlXid;

import javax.sql.XAConnection;
import javax.transaction.xa.XAException;
import javax.transaction.xa.XAResource;
import javax.transaction.xa.Xid;
import java.sql.Connection;
import java.sql.Statement;

public class XaExample {
    public static void main(String[] args) throws Exception{
        String url1 = "jdbc:mysql://192.168.1.103:33061/zqh_db?useSSL=false&serverTimezone=UTC";
        String url2 = "jdbc:mysql://192.168.1.103:33062/zqh_db?useSSL=false&serverTimezone=UTC";

        //从不同的数据库获取数据库数据源
        MysqlXADataSource ds1 = getDataSource(url1,"root","123456");
        MysqlXADataSource ds2 = getDataSource(url2,"root","123456");

        //数据库1获取连接
        XAConnection xAconn1 = ds1.getXAConnection();
        Connection conn1 = xAconn1.getConnection();
        XAResource xaResource1 = xAconn1.getXAResource();
        Statement statement1 = conn1.createStatement();

        //数据库2获取连接
        XAConnection xAconn2 = ds2.getXAConnection();
        Connection conn2 = xAconn2.getConnection();
        XAResource xaResource2 = xAconn2.getXAResource();
        Statement statement2 = conn2.createStatement();

        //其中xid是一个全局唯一的id标示一个分支事务，每个分支事务有自己的全局唯一的一个id。
        Xid xid1 = new MysqlXid(new byte[]{0x01},new byte[]{0x02},100);
        Xid xid2 = new MysqlXid(new byte[]{0x011},new byte[]{0x012},100);
        try {
            //事务分支1关联事务sql语句
            xaResource1.start(xid1,XAResource.TMNOFLAGS);
            int insert1 = statement1.executeUpdate("INSERT into t_user (user_id,user_name,user_work,user_tel,user_age,user_sex,user_email,user_desc) VALUES (6,'宋江','演员','13520332614','1','1','The@1312312.com','第一部分（第一至第三段），交代人物，叙述跟父亲奔丧回家的有关情节，为描写父亲的背影作好铺垫')");
            xaResource1.end(xid1,XAResource.TMSUCCESS);

            //事务分支2关联事务sql语句
            xaResource2.start(xid2,XAResource.TMNOFLAGS);
            int insert2 = statement2.executeUpdate("INSERT into t_user (user_id,user_name,user_work,user_tel,user_age,user_sex,user_email,user_desc) VALUES (5,'宋江','演员','13520332614','1','1','The@1312312.com','第一部分（第一至第三段），交代人物，叙述跟父亲奔丧回家的有关情节，为描写父亲的背影作好铺垫')");
            xaResource2.end(xid2,XAResource.TMSUCCESS);

            //两阶段提交协议第一阶段
            int ret1 = xaResource1.prepare(xid1);
            int ret2 = xaResource2.prepare(xid2);

            //两阶段提交协议第二阶段
            if(XAResource.XA_OK == ret1 && XAResource.XA_OK == ret2){
                xaResource1.commit(xid1,false);
                xaResource2.commit(xid2,false);
                System.out.println("成功");
            }
        }catch (XAException e){
            xaResource1.rollback(xid1);
            xaResource2.rollback(xid2);
            e.printStackTrace();
        }
    }

    public static MysqlXADataSource getDataSource(String url, String username, String password){
        MysqlXADataSource dataSource = new MysqlXADataSource();
        dataSource.setURL(url);
        dataSource.setUser(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
