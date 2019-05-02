package com.roro.springboottomcatstater.compent;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyRedisBeanPostProcessor implements BeanPostProcessor{

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof RedisTemplate) {
            RedisTemplate redisTemplate = (RedisTemplate) bean;
            redisTemplate.setDefaultSerializer(new Jackson2JsonRedisSerializer(Object.class));
            return redisTemplate;
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof RedisTemplate) {
            RedisTemplate redisTemplate = (RedisTemplate) bean;
            log.info("redisTemplate的序列化器:{}",redisTemplate.getDefaultSerializer().getClass().getSimpleName());
        }
        return bean;
    }

}
