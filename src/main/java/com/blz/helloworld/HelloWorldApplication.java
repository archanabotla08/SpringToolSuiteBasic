package com.blz.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
//		  System.setProperty("server.port", "9000");
//	        SpringApplication.run(HelloWorldApplication.class, args);
		System.out.println("Hello World");
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
