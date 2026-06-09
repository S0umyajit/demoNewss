package com.example.test.demoNewss.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@RestController
public class Controller {

    private List<Employee> employees=new ArrayList<>();
    @GetMapping("/message")
    public String getMessage(){
        return "Hello World";
    }
    @GetMapping("/employee")
    public List<Employee> getEmployee(){
        return employees;
    }

    @PostMapping("/employee")
    public void saveEmployee(@RequestBody Employee employee){
        employees.add(employee);
    }

    @DeleteMapping("/employee")
    public void deleteEmployee(@RequestParam int id){
       employees.removeIf((emp)->emp.getId()==id);
    }

    @PutMapping("employee/{id}")
    public void updateEmployee(@PathVariable int id,@RequestBody Employee employee){
        IntStream.range(0,employees.size())
                .filter((i)->employees.get(i).getId()==id)
                .findFirst()
                .ifPresent(i->employees.set(i,employee));
    }
}
