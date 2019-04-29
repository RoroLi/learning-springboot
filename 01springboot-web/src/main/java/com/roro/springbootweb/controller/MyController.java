package com.roro.springbootweb.controller;

import com.roro.springbootweb.exception.MyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/testHello")
    public String testTuling() {
        return "testHello";
    }

    @RequestMapping("/testError")
    public String testError() {
        throw new MyException(100,"用户不存在");
    }
}
