package com.lulu.lulu_Recap_MS3_Employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lulu.lulu_Recap_MS3_Employee.Entity.Employee;
import com.lulu.lulu_Recap_MS3_Employee.Repo.EmployeeRepo;

@RestController
@CrossOrigin
@RequestMapping("/Em")
public class EmployeeController {


	@Autowired
	EmployeeRepo employeerepo;

	@GetMapping("/employee")
	  public List<Employee> getJPQL(){
		return employeerepo.findAll();

	}

	@PostMapping("/employee")
	  public Employee createuser(@RequestBody Employee prod) {
		return employeerepo.save(prod);
	}

	@DeleteMapping("/employee/{id}")
	  public void delete(@PathVariable("id") Integer id) {
		employeerepo.deleteById(id);
	}

	@PutMapping("/employee/{id}")
	public Employee updateUsers(@RequestBody Employee employee,@PathVariable int id) {
		Employee newEmployee = employeerepo.findById(id)
				.orElseThrow(() -> new RuntimeException("Inventory not exist with id :" + id));
		newEmployee.setName(employee.getName());
		newEmployee.setDept(employee.getDept());
		newEmployee.setSalary(employee.getSalary());
		 return employeerepo.save(newEmployee);

    }
	@PatchMapping("/employee/{id}")
	public Employee updateUserInfo (@PathVariable ("id") Integer id) {
		Employee newEmployee = employeerepo.findById(id)
				.orElseThrow(() -> new RuntimeException("Inventory not exist with id :" + id));
		newEmployee.setSalary(newEmployee.getSalary());
		 return employeerepo.save(newEmployee);
	}


	/* @PatchMapping("/Employee/{id}")
	public Employee updateEmployeeInfo (@PathVariable ("id") Integer id) {
		//Optional<Users> user1 = ur.findById(id);
		Employee newEmployee = employeerepo.findById(id)
				.orElseThrow(() -> new RuntimeException("Inventory not exist with id :" + id));
		newEmployee.setPassword("Rakshit!123");
		return employeerepo.save(newEmployee);

    }
    */
}
