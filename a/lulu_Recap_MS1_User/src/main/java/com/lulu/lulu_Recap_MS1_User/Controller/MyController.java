package com.lulu.lulu_Recap_MS1_User.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

import com.lulu.lulu_Recap_MS1_User.Entity.Users;
import com.lulu.lulu_Recap_MS1_User.Repo.UsersRepo;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class MyController {


	@Autowired
	UsersRepo userrepo;

	@GetMapping("/user")
	  public List<Users> getJPQL(){
		return userrepo.findAll();

	}

	@PostMapping("/user")
	  public Users createuser(@RequestBody Users prod) {
		return userrepo.save(prod);
	}

	@DeleteMapping("/user/{id}")
	  public void delete(@PathVariable("id") Integer id) {
		userrepo.deleteById(id);
	}

	@PutMapping("/user/{id}")
	public ResponseEntity<Object> updateUsers(@RequestBody Users users,@PathVariable int id) {
    java.util.Optional<Users> UsersOptional = userrepo.findById(id);
	if (UsersOptional.isEmpty()) {
		return ResponseEntity.notFound().build();
	}
	users.setId(id);
	userrepo.save(users);
	return ResponseEntity.noContent().build();
	}

	@PatchMapping("/user/{id}")
	public Users updateUserInfo (@PathVariable ("id") Integer id) {
		//Optional<Users> user1 = ur.findById(id);
		Users newUser = userrepo.findById(id)
				.orElseThrow(() -> new RuntimeException("Inventory not exist with id :" + id));
		newUser.setPassword("Ajith!123");
		return userrepo.save(newUser);

    }
}


/*@PutMapping("/user/{id}")
	public ResponseEntity<Object> updateUsers(@RequestBody Users users,@PathVariable int id) {
    java.util.Optional<Users> UsersOptional = userrepo.findById(id);
	if (UsersOptional.isEmpty()) {
		return ResponseEntity.notFound().build();
	}
	users.setId(id);
	userrepo.save(users);
	return ResponseEntity.noContent().build();
	}
*/

