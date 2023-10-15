package com.demo.LuLu_02_MS2_Customercare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.LuLu_02_MS2_Customercare.entity.Customercare;
import com.demo.LuLu_02_MS2_Customercare.repository.CustomercareRepo;

@RestController
public class CustomercareController {

	//CRUD with Customer care

	@Autowired
	CustomercareRepo customercareRepository;

	@GetMapping("/ccs/getCustomercare")
	public List<Customercare> getCustomercare() {

		return customercareRepository.findAll(); // select * from <TableName>;

	}


	@PostMapping("/ccs/addCustomercare")
	public Customercare createuser(@RequestBody Customercare care) {
		return customercareRepository.save(care);
	}

	@DeleteMapping("/ccs/deleteCustomercare/{id}")

	public void deleteCustomercare(@PathVariable("id") Integer id  ) {


		customercareRepository.deleteById(id); // select * from <TableName>;
	}


	@GetMapping("/ccs/hellocustomercare")
	public String Hello() {
		return "Communication successful between product and customer care";
	}
}
