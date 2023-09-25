package com.heima.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class TestListener {

    @KafkaListener(topics = "ms-mirrorseek")
    public void onMessage(String message) {
        if (!StringUtils.isEmpty(message)) {
            System.out.println(message);
        }
    }
}
