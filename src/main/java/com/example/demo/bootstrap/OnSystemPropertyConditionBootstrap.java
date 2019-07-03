package com.example.demo.bootstrap;

import com.example.demo.condition.ConditionalOnSystemProperty;
import com.example.demo.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * 系统属性条件引导类
 */
public class OnSystemPropertyConditionBootstrap {

    @Bean
    @ConditionalOnSystemProperty(name = "user.name", value = "Jack")
    public String helloWorld(){
        return "Hello world";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(OnSystemPropertyConditionBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String helloWorld = context.getBean("helloWorld", String.class);
        System.out.println("helloWorld Bean : " + helloWorld);

        context.close();
    }
}
