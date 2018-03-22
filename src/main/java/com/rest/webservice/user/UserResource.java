package com.rest.webservice.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {

	@Autowired
	private UserDaoService service;
	//retrieve all users
	@GetMapping("/users")
	public List<User> retrievAllUsers(){
		return service.findAll();
	}
	
	//GET /users/{id}
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int id) {
		return service.findOne(id);
	}
	
	@PostMapping("/users")
	public void createUser(@RequestBody User user) {
		User savedUser=service.save(user);
		ServletUriComponentsBuilder.fromCurrentRequest().path("/{is}").buildAndExpand(savedUser.getId()).toUri();
		ResponseEntity<T>.created(location);
	}
}
