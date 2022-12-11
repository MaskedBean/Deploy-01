package com.example.Deploy1.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private Environment environment;

    @Value("${myDevNameTree.devName}")
    String devName;


    @GetMapping("/")
    private String getDevName(){
        String st = environment.getProperty("myDevNameTree.devName");
        return st;
    }

    @GetMapping("/test")
    private String getdevNameII(){
        return devName;
    }
}
