package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class SpringEmployeeAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringEmployeeAppApplication.class, args);
    }
}
