package com.demo.LuLu_02_MS1_Product.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.LuLu_02_MS1_Product.entity.SportsProducts;
import com.demo.LuLu_02_MS1_Product.repository.ProductRepository;



	@RestController  //We use it to create REST API end point along with http methods like GET,POST,DELETE,PUT,PATCH
	public class MyController {


		@Autowired
		ProductRepository productRepository;

		@GetMapping("/pps/getProduct")
		public List<SportsProducts> getJPQL() {
			return productRepository.findAll(); // select * from <TableName>;
		}

		@PostMapping("/pps/addProduct")
		public SportsProducts createuser(@RequestBody SportsProducts prod) {
			return productRepository.save(prod);
		}



		////////////////////////////////
		@Autowired
		CustomercareRestController ccrc;


		@GetMapping("/pps/productToCustomer")
		public String helloProduct() {
			//Here we are trying to invoke or call other microservice methods or implementations
			return ccrc.Hello();

		}
	}
