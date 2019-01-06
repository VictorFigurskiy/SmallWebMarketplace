package com.marketplace.project.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.marketplace.project.controllers")
public class SmallWebMarketplaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmallWebMarketplaceApplication.class, args);
    }

}

