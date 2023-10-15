package com.lulu.Lulu_02_SpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

 

@RestController // we use it create REST API end point along with http Methods
//Like GET POST DELETE PUT PATCH
//POSTMAN
public class MyController {
	
	@GetMapping("/hello")
	public String hello()
	{
		return "Hello World";

	}
	@GetMapping("/add")
	public int add() {
		int a=5;
		int b=10;
		int sum=a+b;
		return sum;
	}
	@GetMapping("/info")
	public String info() {
		return "<h1> Hi, I am Reddy from lululemon </h1>";

	}


}
