package com.example.springboot;

import net.hasor.spring.boot.EnableHasor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@EnableHasor
@SpringBootApplication
public class ExampleApp {
    public static void main(String[] args) {
        SpringApplication.run(ExampleApp.class, args);
    }
}