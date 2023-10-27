package com.lulu.promotions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PromotionsController {

	@GetMapping("/hello")   //Annotation for mapping HTTP GET requests onto specific handler methods
	public String hello() {
		return "Hello World";
	}


}