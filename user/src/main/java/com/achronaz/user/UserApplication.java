package com.achronaz.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class UserApplication {

    public static void main(String[] args) {
        //SpringApplication.run(UserApplication.class,args);
        ConfigurableApplicationContext applicationContext = SpringApplication.run(UserApplication.class, args);
        String name = applicationContext.getEnvironment().getProperty("name");
        System.err.println("name :"+name);
    }
}
