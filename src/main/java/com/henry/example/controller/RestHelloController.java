package com.henry.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHelloController {

	
	@GetMapping("/resttest") 
	public String index() { //return return
	 return "Greetings from Spring Boot!. My first spring boot web app"; //return
	 //"service1page"; 
	 
	}
	 
	 
}