package com.blz.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/web")
	public String hello() {
		return "Hello";
	}
	
	@RequestMapping("/web/message")
	public String message(Model model) {
		model.addAttribute("messageResponse","This is a custom message");
		return "This is a custom message";
	}
}
