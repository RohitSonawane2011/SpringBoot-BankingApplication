package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.dao.UserDao;
import com.demo.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired // Injecting Userdao Object ; userdao object creation
	private UserDao userDao;

	@Override
	public User addUser(@RequestBody User user) {
		User newUser = userDao.save(user);
		return newUser; // User return type returned or Return Directly
	}

	@Override
	public User updateUserById(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserByID(Integer userID) {
		// TODO Auto-generated method stub

	}

	@Override
	public User getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
