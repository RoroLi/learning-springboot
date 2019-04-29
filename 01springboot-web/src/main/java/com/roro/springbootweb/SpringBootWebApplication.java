package com.roro.springbootweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApplication.class, args);
        System.err.println("演示了添加webjar的前台框架");
        System.err.println("webjar官网https://www.webjars.org/");
        System.err.println("例如在pom中添加了jquery依赖");
        System.err.println("启动");
        System.err.println("访问：http://localhost:8080/webjars/jquery/3.3.1-2/jquery.js");


        System.err.println("MyConfig类配置了自定义过滤器、拦截器");
        System.err.println("访问：http://localhost:8080/testHello");
        System.err.println("控制台会有相关打印");

        System.err.println("MyConfig类配置了自定义Servlet");
        System.err.println("访问：http://localhost:8080/test123");
        System.err.println("页面中会有hello......");

        System.err.println("页面中会有hello......");

    }

}
