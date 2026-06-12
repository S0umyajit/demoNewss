package com.example.test.demoNewss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("singleton")
public class StudController {
    @Autowired
    private Stud stud;
    @Autowired
    private StudService studService;

    @GetMapping("/stu")
    public void getSt(){
        System.out.println("stud:controller: "+stud.hashCode());
        System.out.println("stud service in controller: "+studService.getStudent().hashCode());
    }
}
