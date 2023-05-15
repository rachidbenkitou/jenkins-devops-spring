package com.wedocode.jenkinsdevopsspring.controller;

import com.wedocode.jenkinsdevopsspring.service.JenkinsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {
    private final JenkinsService jenkinsService;

    public JenkinsController(JenkinsService jenkinsService) {
        this.jenkinsService = jenkinsService;
    }

    @GetMapping("/get")
    public String sayHello(){
        return jenkinsService.sayHello();
    }
}
