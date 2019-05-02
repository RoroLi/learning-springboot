package com.roro.springboottomcatstater.config;

import com.roro.springboottomcatstater.compent.MyBeanPostProcessor;
import com.roro.springboottomcatstater.compent.MyCompent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

 /*   @Bean
    public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory)  {
        RedisTemplate<Object, Object> template = new RedisTemplate<>();
        template.setDefaultSerializer(new Jackson2JsonRedisSerializer<Object>(Object.class));
        template.setConnectionFactory(redisConnectionFactory);
        return template;
    }*/


    @Bean(initMethod = "init")
    public MyCompent myCompent() {
        return new MyCompent();
    }

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor() {
        return new MyBeanPostProcessor();
    }
}
