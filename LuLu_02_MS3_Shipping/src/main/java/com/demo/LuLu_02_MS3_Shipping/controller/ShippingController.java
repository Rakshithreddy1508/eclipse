package com.demo.LuLu_02_MS3_Shipping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.LuLu_02_MS3_Shipping.entity.Shipping;
import com.demo.LuLu_02_MS3_Shipping.repository.ShippingRepo;

@RestController

public class ShippingController {

		@Autowired
		ShippingRepo shippingrepository;
		@GetMapping("/sss/getDetail")
		public List<Shipping> getDetail() {
			return shippingrepository.findAll(); // select * from <TableName>;

		}
		@PostMapping("/addDetail")
		public Shipping createuser(@RequestBody Shipping prod) {
			return shippingrepository.save(prod);

		}

		@DeleteMapping("/delDetail/{shipid}")
		public void delProduct(@PathVariable("shipid")Integer shipid) {
			shippingrepository.deleteById(shipid);
	}
}