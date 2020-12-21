package com.blz.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldRestController {

	@RequestMapping(value = {"","/","/home" })
	public String sayHello() {
		return "Hello From Archana";
	}
}
