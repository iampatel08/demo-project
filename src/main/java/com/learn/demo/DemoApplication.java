package com.learn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args)
	{
	    ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
	    emp e = context.getBean(emp.class);
	    tech t = context.getBean(tech.class);
		//registration r = context.getBean(registration.class);


	    e.display();
	    e.generateRandomPassword();
	    t.display();
	    t.password();
	   // r.registration();



	}

}
