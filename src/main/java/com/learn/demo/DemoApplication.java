package com.learn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(DemoApplication.class, args);
	    //ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		//index index = context.getBean(index.class);

	}

}
