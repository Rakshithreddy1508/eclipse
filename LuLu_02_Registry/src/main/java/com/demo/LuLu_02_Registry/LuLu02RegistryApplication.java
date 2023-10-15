package com.demo.LuLu_02_Registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;




@EnableEurekaServer
@SpringBootApplication
public class LuLu02RegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuLu02RegistryApplication.class, args);
	}

}
