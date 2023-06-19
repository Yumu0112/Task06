package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class GreetingController {

//    path内で含まれる値をメソッドの処理に利用する
//    @pathVariableで引数指定
//    path変数：階層的なリソースの表現や識別に使用
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
