package com.thinhreal.greeter_api.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EnglishGreetingService implements GreetingService {

    private final String secretMessage;

    public EnglishGreetingService(@Value("${app.custom.message}") String message) {
        this.secretMessage = message;
    }
    @Override
    public String getGreeting() {
        return "this is" + secretMessage;
    }

}
