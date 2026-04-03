package com.example.paymentservice.client;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "bank-service", url = "http://localhost:9090")
public interface BankClient {

    @GetMapping("/process")
    @CircuitBreaker(name = "bankServiceCB", fallbackMethod = "fallbackPayment")
    String callBank();

    default String fallbackPayment(Throwable t) {
        return "Bank service unavailable, please try later.";
    }
}
