package com.example.jenkins.jenkinstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinstestApplication {

    public static void main(String[] args) {
        System.out.println("========================Jenkins Test Start========================");
        SpringApplication.run(JenkinstestApplication.class, args);
        System.out.println("========================Jenkins Test End========================");
    }

}
