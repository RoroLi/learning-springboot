package com.roro.springbootquickstart;

import com.roro.springbootquickstart.controller.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = Person.class)
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

        System.err.println("启动SpringBoot后");
        System.err.println("访问http://localhost:8082/springbootquickstart/helloword");
        System.err.println("控制台会打印peison的信息");

        System.err.println("配置注解@EnableConfigurationProperties(value = Person.class)");
        System.err.println("配置@ConfigurationProperties(prefix = \"person\")");
        System.err.println("配置application-yml");

    }

}
