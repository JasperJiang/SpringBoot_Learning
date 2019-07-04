package com.example.demo.bootstrap;

import com.example.demo.annotation.EnableHelloWorld;
import com.example.demo.repository.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * 仓储当引导类
 */
@EnableHelloWorld
public class HelloWorldBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(HelloWorldBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        // 关闭上下文
        context.close();
    }

}
