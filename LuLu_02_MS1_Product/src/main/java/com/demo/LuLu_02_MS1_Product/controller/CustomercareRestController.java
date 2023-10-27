package com.demo.LuLu_02_MS1_Product.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name ="Customercare-service")  //other micro service name
public interface CustomercareRestController {
	@GetMapping("ccs/hellocustomercare")
	public String Hello();

}
