package zxl.com.springbootatomikosjtadruid.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class DataSourceConfig {
    @Autowired
    private Environment env;

    @Bean(name = "primaryDS")
    @Primary
    public DataSource primaryDataSource(){
        AtomikosDataSourceBean ds = new AtomikosDataSourceBean();
        ds.setXaDataSourceClassName("com.alibaba.druid.pool.xa.DruidXADataSource");
        ds.setUniqueResourceName("primaryPN");
        ds.setPoolSize(5);
        ds.setXaProperties(build("zxl.primary.datasource."));
        return ds;
    }

    @Bean(name = "secondaryDS")
    public DataSource dataSource(){
        AtomikosDataSourceBean ds = new AtomikosDataSourceBean();
        ds.setXaDataSourceClassName("com.alibaba.druid.pool.xa.DruidXADataSource");
        ds.setUniqueResourceName("secondaryRN");
        ds.setPoolSize(5);
        ds.setXaProperties(build("zxl.secondary.datasource."));
        return ds;
    }

    private Properties build(String prefix){
        Properties prop = new Properties();
        prop.put("url",env.getProperty(prefix+"url"));
        prop.put("username",env.getProperty(prefix+"username"));
        prop.put("password",env.getProperty(prefix+"password"));
        prop.put("driverClassName",env.getProperty(prefix+"driverClassName"));
        return prop;
    }

}
