package com.example.demo;

import org.springframework.content.annotation.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

@Configuration
public class TwilioInitializer {

    private final TwilioConfiguration twilioConfiguration;

   @AutoWired
    public TwilioInitializer(TwilioConfiguration twilioConfiguration) {
        this.twilioConfiguration = twilioConfiguration;
    }


}