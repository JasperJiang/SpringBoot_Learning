package com.example.demo.bootstrap;

import com.example.demo.repository.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * 仓储当引导类
 */
@ComponentScan(basePackages = "com.example.demo.repository")
public class RepositoryBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(RepositoryBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);


        // myFirstLevelRepository Bean 是否存在
        MyFirstLevelRepository myFirstLevelRepository = context.getBean(MyFirstLevelRepository.class);

        System.out.println("myFirstLevelRepository Bean : " + myFirstLevelRepository.toString());

        // 关闭上下文
        context.close();
    }

}
