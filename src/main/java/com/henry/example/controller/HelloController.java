package com.henry.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping("/test")  
	public String index1() { //return
	  return "service1page1"; 
	  }
	
	@RequestMapping("/test2")  
	public String index2() { //return
	  return "service1page2"; 
	  }
	
	@RequestMapping("/service1action")  
	public String formsubmit(@RequestParam String fname, @RequestParam String lname) { //return
	  System.out.println("Input parameters: " + fname + " " + lname);
		return "formsubmitresult"; 
	  }
}