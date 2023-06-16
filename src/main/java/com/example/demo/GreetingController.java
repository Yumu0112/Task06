package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class GreetingController {

    @GetMapping("/greeting/{country}")
    public String getMessageByCountry(@PathVariable String country) {
        String message;

        switch (country) {
            case "japan":
                message = "こんにちは！";
                break;
            case "us":
                message = "Hello!";
                break;
            case "france":
                message = "Bonjour !";
                break;
            case "korea":
                message = "안녕하세요!";
                break;
            default:
                message = "Unsupported country.";
                break;
        }

        return message;
    }
}