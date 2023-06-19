package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
@RestController
public class CurrentTimeController {
        @GetMapping("/current")
        public CurrentTimeResponse getTime() {

//            return "日時：" +  LocalDateTime.now();

        // 現在時刻を格納する変数を定義
           LocalDateTime currentTime = LocalDateTime.now();
           return new CurrentTimeResponse(currentTime);
        }

        // 内部クラスで時刻を保持、JSONオブジェクトの生成
        public static class CurrentTimeResponse {
            private LocalDateTime timestamp;


            public CurrentTimeResponse(LocalDateTime currentTime) {
                this.timestamp = currentTime;
            }

        // getterとsetter: 外部からアクセスできるようにする
            public LocalDateTime getTimestamp() {
                return timestamp;
            }

            public void setTimestamp(LocalDateTime timestamp) {
                this.timestamp = timestamp;
            }
        }
}
