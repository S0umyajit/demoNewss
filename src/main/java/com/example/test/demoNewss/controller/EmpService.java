package com.example.test.demoNewss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    EmpRepository empRepository;

    public Emp getEmpById(long id){
        return empRepository.findById(id)
                .orElse(null);
    }
}
