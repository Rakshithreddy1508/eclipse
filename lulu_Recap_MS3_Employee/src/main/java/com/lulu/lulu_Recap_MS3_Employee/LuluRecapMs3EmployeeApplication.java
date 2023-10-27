package com.lulu.lulu_Recap_MS3_Employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LuluRecapMs3EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuluRecapMs3EmployeeApplication.class, args);
	}

}
