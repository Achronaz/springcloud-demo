package com.achronaz.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class InventoryApplication {

    public static void main(String[] args) {
        //SpringApplication.run(InventoryApplication.class,args);
        ConfigurableApplicationContext applicationContext = SpringApplication.run(InventoryApplication.class, args);
        String name = applicationContext.getEnvironment().getProperty("name");
        System.err.println("name :"+name);
    }
}
