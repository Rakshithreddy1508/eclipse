package com.demo.LuLu_02_MS1_Product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;



@EnableFeignClients
@SpringBootApplication
public class LuLu02Ms1ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuLu02Ms1ProductApplication.class, args);
	}

}
//Product