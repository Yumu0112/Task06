package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryParamController {

//
//    QueryParam:検索クエリ、フィルタリング条件、ソートオプションなど、追加のパラメータを伝える
    @GetMapping("/QueryGreeting")
    public String greet(@RequestParam String lang) {
        String greet;

        switch (lang) {
            case "japan":
                greet = "こんにちは！";
                break;
            case "us":
                greet = "Hello!";
                break;
            case "france":
                greet = "Bonjour !";
                break;
            case "korea":
                greet = "안녕하세요!";
                break;
            default:
                greet = "Unsupported country.";
                break;
        }

        return greet;

    }
}
