package com.example.coolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Index {

    @GetMapping("/")
    public String sayHello() {
        return "Hello Word";
    }
}
