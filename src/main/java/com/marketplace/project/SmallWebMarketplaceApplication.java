package com.marketplace.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(value = {"com.marketplace.project.controllers", "com.marketplace.project.services", "com.marketplace.project.dao", "com.marketplace.project.entities"})
@SpringBootApplication
public class SmallWebMarketplaceApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SmallWebMarketplaceApplication.class, args);

//        for (String name: applicationContext.getBeanDefinitionNames()) {
//
//            System.out.println(name);
//
//        }
    }

}

