package zxl.com.springbootatomikosjtadruid2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zxl.com.springbootatomikosjtadruid2.service32.JtaTestService;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/jtaTest")
public class JtaTestController {
    @Autowired
    @Qualifier("jtaTestServiceImpl")
    private JtaTestService jtaTestService;

    @GetMapping("/test01")
    public Map<String,Object> test01(){
        LinkedHashMap<String,Object> resultMap=new LinkedHashMap<String,Object>();
        try {
            jtaTestService.test01();
        }catch (Exception e){
            resultMap.put("state","fail");
            resultMap.put("message","分布式事务同步失败");
            return resultMap;
        }
        resultMap.put("state","success");
        resultMap.put("message","分布式事务同步失败");
        return resultMap;
    }
}
