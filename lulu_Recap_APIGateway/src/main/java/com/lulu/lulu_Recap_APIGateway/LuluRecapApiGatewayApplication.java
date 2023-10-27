package com.lulu.lulu_Recap_APIGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class LuluRecapApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuluRecapApiGatewayApplication.class, args);
	}

}
