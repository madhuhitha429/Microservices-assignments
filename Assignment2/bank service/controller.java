package com.example.bankservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class BankController {

    @GetMapping("/process")
    public String processPayment() {
        return "Payment processed successfully by Bank Service";
    }
}
