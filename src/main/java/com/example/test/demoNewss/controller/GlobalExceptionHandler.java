package com.example.test.demoNewss.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ArithmeticException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<String> handleArithmetic(ArithmeticException e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body("Cannot divide by zero");
    }

    @ExceptionHandler(TestException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<String> handleTestException(TestException t){
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("something went wrong: "+t.getMessage());
    }
}
