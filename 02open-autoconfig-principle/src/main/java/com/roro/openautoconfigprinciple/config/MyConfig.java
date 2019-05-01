package com.roro.openautoconfigprinciple.config;

import com.roro.openautoconfigprinciple.compent.MyBeanDefinitionRegister;
import com.roro.openautoconfigprinciple.compent.MyImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@Import(value = {MyImportSelector.class})
@Import(value = {MyImportSelector.class, MyBeanDefinitionRegister.class})
public class MyConfig {

}

