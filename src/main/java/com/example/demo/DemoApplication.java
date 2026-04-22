package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@RestController
public class DemoApplication {

    @GetMapping("/")
    @CrossOrigin(origins = "*")
    public String home() {
        return "Hello from Spring Boot Docker test file and welcome to java.And hope you are alright..and willing to help you guys.btw where is your location?";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
