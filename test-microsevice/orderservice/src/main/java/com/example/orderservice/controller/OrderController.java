package com.example.orderservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping(path = "orders")
public class OrderController {

    @RequestMapping(method = RequestMethod.GET)
    public String getList(){
        return "list order";
    }

    @RolesAllowed("user")
    @RequestMapping(method = RequestMethod.GET, path = "detail")
    public String getDetail(){
        return "Detail order";
    }
}
