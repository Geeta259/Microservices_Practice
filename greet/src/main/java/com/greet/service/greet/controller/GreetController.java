package com.greet.service.greet.controller;

import com.greet.service.greet.client.WelcomeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @Autowired
    private WelcomeClient welcomeClient;

    @GetMapping("/greet")
    public String getGreetMsg()
    {
        String greetMsg = "Good Morning....";
        String welcomeMsg = welcomeClient.getWelcomeApi();
        return greetMsg+" "+welcomeMsg;
    }
}
