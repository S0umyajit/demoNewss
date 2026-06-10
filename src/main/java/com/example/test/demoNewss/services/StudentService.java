package com.example.test.demoNewss.services;

import com.example.test.demoNewss.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    Student student;
    StudentService(){
        System.out.println("Student Service Object created at address; "+this.hashCode());
    }

    public Student getStudent(){
        return student;
    }
}
