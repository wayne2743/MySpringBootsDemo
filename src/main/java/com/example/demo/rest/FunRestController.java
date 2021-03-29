package com.example.demo.rest;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	
	// expose "/" that return "Hello World"
	@RequestMapping("/")
	public String sayHello() {
		return "Hello World! Time on server is" + LocalDateTime.now();
	}
	

	
}
