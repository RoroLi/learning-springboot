package com.roro.openautoconfigprinciple.config;

import com.roro.openautoconfigprinciple.condition.MyAspect;
import com.roro.openautoconfigprinciple.condition.MyConditional;
import com.roro.openautoconfigprinciple.condition.MyLog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
//配置类
public class CondtionConfig {

    @Bean
    public MyAspect myAspect() {
        System.out.println("向容器中加入一个TulingAspect");
        return new MyAspect();
    }

    @Conditional(value = MyConditional.class)
    @Bean
    public MyLog myLog() {
        System.out.println("当TulingConditional返回true时，向容器中加入一个TulingLog");
        return new MyLog();
    }
}
