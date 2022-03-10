package com.example.orderservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @RequestMapping(path = "/say", method = RequestMethod.GET)
    @RolesAllowed("user")
    public String hello(){
        return "Hello world";
    }

    @RequestMapping(path = "/alo", method = RequestMethod.GET)
    public String helloHa(){
        return "Hello helloHa";
    }
}
