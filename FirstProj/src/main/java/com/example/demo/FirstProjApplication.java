package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjApplication {

	public static void main(String[] args) {
		//spring container
		ConfigurableApplicationContext context = SpringApplication.run(FirstProjApplication.class, args);
		
		Alien a = context.getBean(Alien.class);
		a.show();
		
		Alien a1 = context.getBean(Alien.class);  //default singleton only 1 object
		a1.show();
	}

}
