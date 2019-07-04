package com.jasper.springbootrest.config;

import com.jasper.springbootrest.http.conerter.properies.PropertiesHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * REST {@link WebMvcConfigurer} 实现
 */
@Configuration
public class RestWebMvcConfiiguer implements WebMvcConfigurer {

    public void extendMessageConverters(List<HttpMessageConverter<?>> converters){
        //添加到首位
        converters.set(0, new PropertiesHttpMessageConverter());
    }
}
