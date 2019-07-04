package com.jasper.springbootrest.controller;

import com.jasper.springbootrest.domain.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

@RestController
public class PropertiesRestController {


    @PostMapping(value = "/add/props", consumes = "text/properties;charset=UTF-8")
    public Properties addProperties(@RequestBody Properties properties){
        return properties;
    }

}
