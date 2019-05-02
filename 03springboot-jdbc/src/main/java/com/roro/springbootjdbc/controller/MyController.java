package com.roro.springbootjdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
public class MyController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/testJDBC")
    public List<Map<String,Object>> testJDBC() {
        List<Map<String,Object>> employeeList = jdbcTemplate.queryForList("select * from product");
        return employeeList;
    }
}
