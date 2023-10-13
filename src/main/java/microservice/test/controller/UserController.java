package microservice.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import microservice.test.entity.User;
import microservice.test.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userSer;

	//////////// Save user Controller here //////////
	@PostMapping("/saveUser")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User u = userSer.saveUser(user);
		//return new ResponseEntity<User>(u, HttpStatus.CREATED);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(u);

	}
	
	////////////// Get all User controller here ////////
	@GetMapping("/users")
	public ResponseEntity<List<User>>getAllUser(User user){
		List<User> allUsers = userSer.userList(user);
		
		return new ResponseEntity<List<User>>(allUsers, HttpStatus.OK);
	}
	
	///////// Get single user controller here //////////
	@GetMapping("/users/{id}")
	public ResponseEntity<User>getSingleUser(@PathVariable("id")Long id){
		User u = userSer.getUserById(id);
		return new ResponseEntity<User>(u,HttpStatus.OK);
		
	}
	
	//////// User delete controller here /////////
	@DeleteMapping("/users/{id}")
	public ResponseEntity<String>userDelete(@PathVariable("id")Long id){
		 this.userSer.deleteUser(id);
		return new ResponseEntity<String>("User id = "+ id +" is deleted.",HttpStatus.OK);
	}

}
