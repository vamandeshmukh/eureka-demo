package com.merc.blog.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.merc.blog.user.model.User;
import com.merc.blog.user.service.IUserService;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	IUserService userService;

	@GetMapping(path = "users/{uid}", produces = "application/json")
	public ResponseEntity<User> userById(@PathVariable(name = "uid") Integer userId) {

		User userObj = userService.userById(userId);

		HttpStatus status = HttpStatus.OK;
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "User found successfully.");
		ResponseEntity<User> response = new ResponseEntity<User>(userObj, headers, status);

		return response;
	}

	@PostMapping(path = "users", consumes = "application/json", produces = "application/json")
	public ResponseEntity<User> addUser(@RequestBody User user) {

		User userObj = userService.addUser(user);

		HttpStatus status = HttpStatus.CREATED;
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "User added successfully!");
		ResponseEntity<User> response = new ResponseEntity<User>(userObj, headers, status);

		return response;
	}

}
