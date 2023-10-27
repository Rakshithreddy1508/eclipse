package com.demo.LuLu_02_API_Gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class FallBackController {

	//Backup plan if our product server is down
	@GetMapping("/productServiceCallback")
	public String callback() {
		return "Try again Some Time";
	}

}
