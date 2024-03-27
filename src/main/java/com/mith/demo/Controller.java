package com.mith.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Controller {
    @GetMapping("/Home")
    public String api() {
        return "Welcome to the Spring Boot";
    }
    
}
