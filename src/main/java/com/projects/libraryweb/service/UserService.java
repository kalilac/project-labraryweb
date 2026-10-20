package com.projects.libraryweb.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projects.libraryweb.model.User;

@RestController
@RequestMapping(value = "/users")
public class UserService {
	
	User u = new User(1L, "Maria", "maria@teste.com");
	
	@GetMapping(value = "/all")
	public ResponseEntity<User> findAll() {
		
		return ResponseEntity.ok().body(u);
		
	}

}
