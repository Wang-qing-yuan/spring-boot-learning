package com.soft1851.verify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolationException;

@SpringBootApplication
public class SpringBootVerifyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootVerifyApplication.class, args);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    ResponseEntity<String> handleConstrainViolationException(ConstraintViolationException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }

}
