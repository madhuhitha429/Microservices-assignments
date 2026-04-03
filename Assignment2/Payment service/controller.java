package com.example.paymentservice.controller;

import com.example.paymentservice.client.BankClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {

    @Autowired
    private BankClient bankClient;

    @GetMapping("/pay")
    public String makePayment() {
        return bankClient.callBank();
    }
}
