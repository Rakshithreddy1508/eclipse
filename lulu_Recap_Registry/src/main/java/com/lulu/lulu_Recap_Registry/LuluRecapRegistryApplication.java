package com.lulu.lulu_Recap_Registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LuluRecapRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuluRecapRegistryApplication.class, args);
	}

}
