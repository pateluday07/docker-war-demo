package com.docker.demo.dockerwardemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public String greet(){
        return "Hi, I am war file";
    }

    @GetMapping("/test")
    public String test(){
        return "Test successful :)";
    }
}
