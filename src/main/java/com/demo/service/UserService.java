package com.demo.service;

import com.demo.entity.User;

public interface UserService {
	User addUser(User user); // create User Abstract Method

	User updateUserById(User user); //update user
	
	void deleteUserByID(Integer userID);  //No return type required 
	
	User getUserById(Integer userId);  //fetch single userData
	
	User getAllUsers();  //fetch Multiple userdata

}
