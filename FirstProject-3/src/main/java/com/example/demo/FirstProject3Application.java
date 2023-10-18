package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProject3Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext c=SpringApplication.run(FirstProject3Application.class, args);
		Alien a1=c.getBean(Alien.class,10);
		a1.getlap();
		Alien a2=c.getBean(Alien.class,3);
		a2.getlap();
	}
}
