package com.lulu.lulu_Recap_MS1_User;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LuluRecapMs1UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuluRecapMs1UserApplication.class, args);
	}

}
