package org.example.rat;

import org.example.rat.bot.properties.RatConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RatConfigurationProperties.class)
public class RatApp {

    public static void main(String[] args) {
        SpringApplication.run(RatApp.class, args);
    }
}
