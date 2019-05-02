package com.roro.springbootjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJDBCApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJDBCApplication.class, args);
        System.err.println("本模块演示了SpringBootzi整合JDBC、Druid数据源");
        System.err.println("在DataSource里有关于initial-size、max-active、 min-idle、max-wait的属性");
        System.err.println("但SpringBoot默认的DataSourceProperties配置类里没有相关属性");
        System.err.println("所以这里自己写了一个DruidDataSourceProperties");
        System.err.println("并在DruidDataSourceConfig里自己new了数据源");
        System.err.println("然后在application.yml配置属性");
        System.err.println("启动，访问：http://localhost:8080/testJDBC 测试");
        System.err.println("访问： http://localhost:8080/druid/index.html");

    }

}
