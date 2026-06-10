package com.example.test.demoNewss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbController {

    @Autowired
    UserRepository userRepository;
    @GetMapping("/insert")
    public void insert(){
        userRepository.save(new UserEntity(1l,"Soumyajit"));
    }
}
