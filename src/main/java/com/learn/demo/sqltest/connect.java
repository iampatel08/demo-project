package com.learn.demo.sqltest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class connect {

    public static void main(String[] args)
    {
        ConfigurableApplicationContext context = SpringApplication.run(connect.class, args);
        insert in = context.getBean(insert.class);
        show sh = context.getBean(show.class);
    }

}
