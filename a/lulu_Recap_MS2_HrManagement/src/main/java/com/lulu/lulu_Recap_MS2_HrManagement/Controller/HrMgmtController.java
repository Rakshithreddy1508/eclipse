package com.lulu.lulu_Recap_MS2_HrManagement.Controller;

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

import com.lulu.lulu_Recap_MS2_HrManagement.Entity.HrMgmt;
import com.lulu.lulu_Recap_MS2_HrManagement.Repo.HrManagementRepo;

@RestController
@CrossOrigin
@RequestMapping("/api2")
public class HrMgmtController {

		@Autowired
		HrManagementRepo hrmgmtrepo;

		@GetMapping("/hr")
		  public List<HrMgmt> getJPQL(){
			return hrmgmtrepo.findAll();

		}

		@PostMapping("/hr")
		  public HrMgmt createuser(@RequestBody HrMgmt prod) {
			return hrmgmtrepo.save(prod);
		}

		@DeleteMapping("/hr/{id}")
		  public void delete(@PathVariable("id") Integer id) {
			hrmgmtrepo.deleteById(id);
		}

		@PutMapping("/hr/{id}")
		public HrMgmt updateUsers(@RequestBody HrMgmt hrmgmt,@PathVariable int id) {
			HrMgmt newHrMgmt = hrmgmtrepo.findById(id)
					.orElseThrow(() -> new RuntimeException("Inventory not exist with id :" + id));
			newHrMgmt.setName(hrmgmt.getName());
			newHrMgmt.setSalary(hrmgmt.getSalary());
			 return hrmgmtrepo.save(newHrMgmt);

	    }
		@PatchMapping("/hr/{id}")
		public HrMgmt updateUserInfo (@PathVariable ("id") Integer id) {
			HrMgmt newHrMgmt = hrmgmtrepo.findById(id)
					.orElseThrow(() -> new RuntimeException("Inventory not exist with id :" + id));
			newHrMgmt.setSalary(25000);
			return hrmgmtrepo.save(newHrMgmt);
		}


}
