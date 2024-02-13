package com.example.javaleichtgemacht;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ZSpringBootHelloWorld {

    public static void main(String[] args) {
        SpringApplication.run(ZSpringBootHelloWorld.class, args);
    }
}

@RestController
class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}