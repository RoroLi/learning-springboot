package com.roro.springboottomcatstater.compent;

import org.springframework.beans.factory.InitializingBean;

public class MyCompent implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("我是InitializingBean的afterPropertiesSet方法");
    }

    public MyCompent() {
        System.out.println("我是构造方法");
    }

    public void init() {
        System.out.println("我是MyCompent的init方法");
    }
}
