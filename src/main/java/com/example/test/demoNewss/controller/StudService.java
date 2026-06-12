package com.example.test.demoNewss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "request",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class StudService {
    @Autowired
    private Stud stud;

    public Stud getStudent(){
        System.out.println("studService: "+stud.hashCode());
        return stud;
    }
}
