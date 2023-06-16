package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
@RestController
public class CurrentTimeController {
        @GetMapping("/current")
        public String getTime() {
            return "日時：" +  LocalDateTime.now();
        }
}
