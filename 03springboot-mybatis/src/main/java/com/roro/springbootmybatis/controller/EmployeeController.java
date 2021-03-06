package com.roro.springbootmybatis.controller;

import com.roro.springbootmybatis.bean.Employee;
import com.roro.springbootmybatis.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeMapper employeeMapper;

    @RequestMapping("/findOne/{id}")
    public Employee findOne(@PathVariable("id")Integer id) {
        return employeeMapper.findOne(id);
    }

    @RequestMapping("/list")
    public List<Employee> list() {
        return employeeMapper.list();
    }

    @RequestMapping("/save")
    public int save(Employee employee){
        employeeMapper.save(employee);
        return employee.getId();
    }
}
