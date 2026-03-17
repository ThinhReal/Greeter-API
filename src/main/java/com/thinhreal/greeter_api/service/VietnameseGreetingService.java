package com.thinhreal.greeter_api.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class VietnameseGreetingService implements GreetingService  {
    @Override
    public String getGreeting() {
        return "Xin chao, chao mung ban den voi Spring Boot";
    }
}
