package com.example.simplewebapplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SimpleWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleWebApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext applicationContext){
        return args -> {
            System.out.println("Let's inspect beans provided by Spring boot!");
            String[] beanNames = applicationContext.getBeanDefinitionNames();
            for (var beanName : beanNames) {
                System.out.println(beanName);
            }
        };
    }
}
