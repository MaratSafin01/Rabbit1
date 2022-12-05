package com.example.rabbit1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(RabbitConfiguration.class)
public class Rabbit1Application {

    public static void main(String[] args) {
        SpringApplication.run(Rabbit1Application.class, args);
    }

}
