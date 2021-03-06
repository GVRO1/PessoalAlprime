package com.gabrielvieira.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ServidorApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ServidorApplication.class, args);
    }
}
