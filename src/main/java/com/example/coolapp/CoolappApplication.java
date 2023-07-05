package com.example.coolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class CoolappApplication {
    public static void main(String[] args) {
        SpringApplication.run(CoolappApplication.class, args);
    }
}
