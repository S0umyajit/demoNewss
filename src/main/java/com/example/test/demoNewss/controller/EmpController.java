package com.example.test.demoNewss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    private EmpService empService;
    @GetMapping("/emp/{id}")
    public Emp getEmp(@PathVariable long id){
        return empService.getEmpById(id);
    }
}
