package com.lulu.lulu_Recap_MS4_Payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class LuluRecapMs4PayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuluRecapMs4PayrollApplication.class, args);
	}

}
