package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Account;
import com.demo.entity.User;
import com.demo.service.UserService;

@RestController
@RequestMapping("api/user")
public class UserController {

	@Autowired // User Service Input Injected Here
	private UserService userService;

	@PostMapping("/createUser")
	public User createUser(@RequestBody User user) {
		return userService.addUser(user);
	}

	@PutMapping ("/update/{id}")// for Update Function
	public User updateUserById(@RequestBody User user, @PathVariable("id") Integer userId) {
		user.setId(userId);
		return userService.updateUserById(user);
	}

	@DeleteMapping ("/delete/{id}") // For Delete Function
	void deleteUserByID(@PathVariable("id") Integer userID) {
		userService.deleteUserByID(userID);
	}
			
	@GetMapping("{id}") // User Id Pass from postman Directly by {}
	public User getUserById(@PathVariable("id") Integer userId) {
		return userService.getUserById(userId); // Directly return
	}

	@GetMapping({ "/getAllUsers" })
	public List<User> getAllUsers() {
		return userService.getAllUsers(); // Directly return
	}
}
