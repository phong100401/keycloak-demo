package com.example.authenticationservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/tests")
public class Test {
    @RequestMapping(method = RequestMethod.GET)
    public String getList(){
        return "Hello";
    }
}
