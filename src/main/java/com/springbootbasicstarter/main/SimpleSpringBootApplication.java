package com.springbootbasicstarter.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SimpleSpringBootApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SimpleSpringBootApplication.class, args);
		System.err.println("Hello Dev-Ops");
	}

}
