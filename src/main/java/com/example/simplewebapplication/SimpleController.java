package com.example.simplewebapplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @RequestMapping("/")
    public String index() {
        return "Hello World!";
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
