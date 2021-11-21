package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@ConfigurationProperties("twilio")
@Configuration
public class TwilioConfiguration {
    private String accountSid;
    private String auth_token;
    private String trail_number;

    public TwilioConfiguration() {
        }

    public String getAccountSid() {
        return accountSid;
    }

    public void setAccountSid(String accountSid) {
        this.accountSid = accountSid;
    }

    public String getAuth_token() {
        return auth_token;
    }

    public void setAuth_token(String auth_token) {
        this.auth_token = auth_token;
    }

    public String getTrail_number() {
        return trail_number;
    }

    public void setTrail_number(String trail_number) {
        this.trail_number = trail_number;
    }
}
