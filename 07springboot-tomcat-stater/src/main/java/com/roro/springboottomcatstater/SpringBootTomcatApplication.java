package com.roro.springboottomcatstater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;

@SpringBootApplication
public class SpringBootTomcatApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootTomcatApplication.class, args);
        System.err.println("先将MyRedisBeanPostProcessor类的注解注释掉  //@Component");
        System.err.println("启动访问：http://localhost:8080/testRedis/abcde/123456");
        System.err.println("通过查看redis实际存储，发现key:abcde value:123456确实在redis里，但貌似是乱码");
        System.err.println("这是因为SpringBoot自动配置的redisTemplate默认是JDK自带的序列化 （this.defaultSerializer = new JdkSerializationRedisSerializer）");
        System.err.println("-----------");
        System.err.println("那么如何修改呢？");
        System.err.println("方式一：");
        System.err.println("自己往容器中注入redisTemplate，参见MyConfig类里被注掉的代码");
        System.err.println("方式二：");
        System.err.println("自定义一个Bean后置处理去修改默认序列化器，参见MyRedisBeanPostProcessor。（打开@Component注解）");
        System.err.println("-----------");
        System.err.println("重点理解Bean后置处理器（BeanPostProcessor），在何时调用的。");
        System.err.println("参见，MyConfig、MyBeanPostProcessor、MyCompent");
        System.err.println("记住，执行顺序:构造方法、BeanPostProcessor的before、InitializingBean、init-method、BeanPostProcessor的after");
        System.err.println("-----------");
        System.err.println();
        System.err.println("重点：理解了BeanPostProcessoer后，学习Tomcat是如何启动的");
        System.err.println(" spring-boot-autoconfigure-2.1.4.RELEASE.jar");
        System.err.println(" org.springframework.boot.autoconfigure.web.embedded下");
        System.err.println(" EmbeddedWebServerFactoryCustomizerAutoConfiguration");


    }

}
