package com.example.demo.configuration;


import com.example.demo.annotation.EnableHelloWorld;
import com.example.demo.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;


@Configuration  // 模块注解装配
@EnableHelloWorld // Spring @Enable 装配
@ConditionalOnSystemProperty(name = "user.name", value = "jjiang153") // 条件装配
public class HelloWorldAutoConfiguration {
}
