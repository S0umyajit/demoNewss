package com.example.test.demoNewss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestEmpController {


    TestEmpController(){
        System.out.println("TestEmpController: "+this.hashCode());
    }
    @Autowired
    TestEmp testEmp1;

    @Autowired
    TestEmp testEmp2;

    @GetMapping("/getHashCode1")
    public Integer getHashcode1(){
        return testEmp1.hashCode();
    }
    @GetMapping("/getHashCode2")
    public Integer getHashcode2(){
        return testEmp2.hashCode();
    }
}
