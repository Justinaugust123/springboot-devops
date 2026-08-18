package com.example.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Spring Boot DevOps application is running!";
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }
}
