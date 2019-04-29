package com.roro.springbootwar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.err.println("本模块为了说明打成war包");
        System.err.println("注意多了一个ServletInitializer类");
        System.err.println("SpringBootServletInitializer这个很重要");
        System.err.println("pom里tomcat的配置");
    }

}
