package zxl.com.springbootatomikosjtadruid2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement(proxyTargetClass = true)  // 启注解事务管理，等同于xml配置方式的
@SpringBootApplication
public class SpringBootAtomikosJtaDruidApplication  {
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(SpringBootAtomikosJtaDruidApplication.class);
//    }


    public static void main(String[] args) {
        SpringApplication.run(SpringBootAtomikosJtaDruidApplication.class, args);
    }
}
