package com.lulu.Lulu_02_SpringSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
	@GetMapping("/one")
	   public String one() {
		   return "hello";
	   }
	   @GetMapping("/two")
	   public String two() {
		   return "Hello-World";
	   }
	   @GetMapping("/three")
	   public String three() {
		   return "Hello-World!!!";
	   }

	}




