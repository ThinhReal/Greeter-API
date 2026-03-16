package com.thinhreal.greeter_api.controller;

import com.thinhreal.greeter_api.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Đánh dấu đây là nơi nhận Request HTTP (giống Route trong Express)
public class GreetingController {

    private final GreetingService greetingService;

    // Constructor Injection: Spring tự động tìm GreetingService và "bơm" vào đây
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greet")
    public String sayHello() {
        return greetingService.getGreeting();
    }
}
