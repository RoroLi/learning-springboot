package com.roro.springboottomcatstater.compent;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if(bean instanceof MyCompent) {
            System.out.println("是我MyCompent 的后置处理器方法调用的postProcessBeforeInitialization");
        }
        return bean;
    }



    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        if(bean instanceof MyCompent) {
            System.out.println("是我MyCompent后置处理器的 postProcessAfterInitialization");
        }
        return bean;
    }
}
