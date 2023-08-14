package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.User;
import com.demo.service.UserService;

@RestController
@RequestMapping("api/user")
public class UserController {

	@Autowired // User Service Input Injected Here
	private UserService userService;

	@PostMapping("/")      // Question Why this "/"
	public User createUser(User user) {
		return userService.addUser(user);
	}

}
