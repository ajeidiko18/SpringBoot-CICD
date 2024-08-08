package com.springboot.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootCicdApplication {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World! This is a CI/CD pipeline for a Spring Boot application.";
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringBootCicdApplication.class, args);
    }

}
