package com.example.paymentservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payments")
public class PaymentController {
    @RequestMapping(method = RequestMethod.GET)
    public String getList(){
        return "List payment Update";
    }
}
