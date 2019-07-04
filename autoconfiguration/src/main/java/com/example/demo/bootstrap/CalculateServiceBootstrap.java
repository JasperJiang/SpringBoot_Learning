package com.example.demo.bootstrap;

import com.example.demo.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * {@Link CalculateService} 引导类
 */

@SpringBootApplication(scanBasePackages = "com.example.demo.service")
public class CalculateServiceBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateServiceBootstrap.class)
                .web(WebApplicationType.NONE)
//                .profiles("Java7")
                .profiles("Java8")
                .run(args);

        CalculateService calculateService = context.getBean(CalculateService.class);

        System.out.println("calculateService sum(1...5) : " + calculateService.sum(1,2,3,4,5));

        context.close();

    }

}
