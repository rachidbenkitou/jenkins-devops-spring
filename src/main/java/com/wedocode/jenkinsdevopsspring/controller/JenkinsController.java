package com.wedocode.jenkinsdevopsspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {
    @GetMapping("/get")
    public String sayHello(){
        return "Hello World!";

    }
}
