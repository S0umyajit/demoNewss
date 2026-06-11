package com.example.test.demoNewss.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api1")
    public String method1(){
         int a = 1 / 0;
         return "Hello";
    }

    @GetMapping("/api2")
    public String Method2() throws TestException{
            throw new TestException("This is a test Exception");
    }
}
