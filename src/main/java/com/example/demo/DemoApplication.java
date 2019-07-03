package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
//@ServletComponentScan(basePackages = "com.example.demo.web.servlet")
public class DemoApplication {

	public static void main(String[] args) {
	    new SpringApplicationBuilder(DemoApplication.class)
//                .web(WebApplicationType.NONE)ø
//                .properties("abc=def")
                .run(args);
//		SpringApplication.run(DemoApplication.class, args);
	}

}
