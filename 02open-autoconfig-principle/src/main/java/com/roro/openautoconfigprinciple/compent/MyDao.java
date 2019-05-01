package com.roro.openautoconfigprinciple.compent;


public class MyDao {
    public MyDao() {
        System.out.println("MyDao是通过ImportBeanDefinitionRegistrar 导入进来的组件");
    }
}
