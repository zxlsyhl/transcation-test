package zxl.com.springbootatomikosjtadruid2.service32.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import zxl.com.springbootatomikosjtadruid2.entity.Log;
import zxl.com.springbootatomikosjtadruid2.entity.User;
import zxl.com.springbootatomikosjtadruid2.service.ILogService;
import zxl.com.springbootatomikosjtadruid2.service2.IUserService;
import zxl.com.springbootatomikosjtadruid2.service32.JtaTestService;

import java.util.LinkedHashMap;
import java.util.Map;

@Service("jtaTestServiceImpl")
public class JtaTestServiceImpl implements JtaTestService {

    @Autowired
    @Qualifier("logServiceImpl")
    private ILogService logService;
    @Autowired
    @Qualifier("userServiceImpl")
    private IUserService userService;

    @Override
    @Transactional(transactionManager = "xatx", propagation = Propagation.REQUIRED, rollbackFor = { RuntimeException.class })
    public Map<String, Object> test01() {
        LinkedHashMap<String,Object> resultMap=new LinkedHashMap<String,Object>();
        Log log = new Log();
        log.setUserId(22);
        log.setLogId(22);
        log.setLogName("122");
        log.setLogDesc("21212");
        logService.insertLog(log);

        User user = new User();
        user.setUserId(22);
        userService.insertLog(user);

        System.out.println(1/0);

        resultMap.put("state","success");
        resultMap.put("message","分布式事务同步成功");
        return resultMap;
    }
}
