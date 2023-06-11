package com.achronaz.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OrderApplication {

    public static void main(String[] args) {
        //SpringApplication.run(OrderApplication.class,args);
        ConfigurableApplicationContext applicationContext = SpringApplication.run(OrderApplication.class, args);
        String name = applicationContext.getEnvironment().getProperty("name");
        System.err.println("name :"+name);
    }
}
