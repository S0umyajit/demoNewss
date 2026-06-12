package com.example.test.demoNewss.controller;

import org.springframework.stereotype.Component;

@Component
public class TestEmp {

    public TestEmp(){
        System.out.println("Constructor Called");
        System.out.println("TestEmp: "+this.hashCode());
    }
}
