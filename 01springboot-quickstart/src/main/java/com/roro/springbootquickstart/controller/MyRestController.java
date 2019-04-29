package com.roro.springbootquickstart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyRestController {

    @Autowired
    private Person person;

    @RequestMapping("/helloword")
    public String helloword() {
        System.out.println(person.toString());
        return "helloword";
    }

}
