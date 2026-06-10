package com.example.test.demoNewss.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
    public Student(){
        System.out.println("Sudent object created at address: "+this.hashCode());
    }
}
