package com.example.test.demoNewss.controller;

import com.example.test.demoNewss.model.Student;
import com.example.test.demoNewss.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    public StudentController(){
        System.out.println("Student controller object created at address: "+this.hashCode());
    }
    @GetMapping("/student")
    public int getStudentAddress(){
        Student s1=studentService.getStudent();
        return s1.hashCode();
    }
}
