package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class HelloWorldConfiguration {
    @Bean
    public void helloWorld(){
        System.out.println("hello world bean");
    }
}
