package com.thinhreal.greeter_api.service;

import org.springframework.stereotype.Service;

@Service
public class EnglishGreetingService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hello from Spring Boot! You are practicing DI.";
    }
}
