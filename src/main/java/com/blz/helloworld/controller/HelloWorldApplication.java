package com.blz.helloworld.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
//		  System.setProperty("server.port", "9000");
//	        SpringApplication.run(HelloWorldApplication.class, args);
		System.out.println("Hello World");
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
