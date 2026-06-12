package com.example.test.demoNewss.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "request",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Stud {

    public Stud(){
        System.out.println("stud bean is created: "+this.hashCode());
    }
}
