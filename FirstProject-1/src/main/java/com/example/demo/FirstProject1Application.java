package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProject1Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext c=SpringApplication.run(FirstProject1Application.class, args);
		Alien a1=c.getBean(Alien.class);
		a1.show();
	}

}
