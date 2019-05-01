package com.roro.openautoconfigprinciple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenAutoconfigPrincipleApplication {
    public static void main(String[] args) {
        SpringApplication.run(OpenAutoconfigPrincipleApplication.class, args);
        System.err.println("以redis为例，简单演示springboot的自动加载");
        System.err.println("注掉//@ImportResource(locations = ‘classpath:beans.xml’)");
        System.err.println("在application.properties配置一下");
        System.err.println("启动应用");
        System.err.println("访问：http://localhost:8080/testRedis，成功调用redis");
        System.err.println("-----------------");
        System.err.println("这里体会一下SpringBoot的自动化配置");
        System.err.println("如果使用Spring则需要配置类似beans.xml一堆配置");
        System.err.println("-----------------");
        System.err.println("极简的演示SpringBoot自动配置所用的技术");
        System.err.println("演示了三种");
        System.err.println(" @Conditional(value = MyConditional.class)");
        System.err.println(" @Import配合ImportBeanDefinitionRegistrar");
        System.err.println(" @Import配合ImportSelector");
    }

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/testRedis")
    public String testRedis() {
        redisTemplate.opsForValue().set("rediskey","123456");
        return "OK";
    }

    //@Bean
//    public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory)  {
//        RedisTemplate<Object, Object> template = new RedisTemplate<>();
//        template.setDefaultSerializer(new Jackson2JsonRedisSerializer<Object>(Object.class));
//        template.setConnectionFactory(redisConnectionFactory);
//        return template;
//    }


}
