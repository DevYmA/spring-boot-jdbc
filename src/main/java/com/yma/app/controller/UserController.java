package com.yma.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.yma.app.bean.User;
import com.yma.app.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/user")
	public String addUser(@RequestBody User user) {
		userService.addUser(user);
		return "data inserted Successfully";
	}
	
	@GetMapping("/user")
	public List<User> findAll(){
		return userService.findAll();
	}
}
