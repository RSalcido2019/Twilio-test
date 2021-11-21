package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;


@Configuration
public class TwilioInitializer {

    private final TwilioConfiguration twilioConfiguration;

   @Autowired
    public TwilioInitializer(TwilioConfiguration twilioConfiguration) {
        this.twilioConfiguration = twilioConfiguration;
    }


}