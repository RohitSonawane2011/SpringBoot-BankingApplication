package com.demo.service;

import java.util.List;
import java.util.Optional;

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
		User exUser = userDao.findById(user.getId()).get(); // 1stly We have Get user By Id // .get method is called for
															// exeption handle

		exUser.setName(user.getName()); // Data from User set to exUser data
		exUser.setEmail(user.getEmail());
		exUser.setMobileNumber(user.getMobileNumber());
		exUser.setDateOfBirth(user.getDateOfBirth());
		exUser.setGender(user.getGender());

		User updatedUser = userDao.save(exUser); // to save above values Save method Called and object Returned to
													// Method

		return updatedUser;
	}

	@Override
	public void deleteUserByID(Integer userID) {
		userDao.deleteById(userID);

	}

	@Override
	public User getUserById(Integer userId) { // For Get By User Id JPA Repository have findByUserID Method------Select
												// Query Will Fire
		Optional<User> exUser = userDao.findById(userId); // findByUserId having return type Optional<User>-
															// ----Optional is Java8 Feature
		return exUser.get(); // Compulsory You have to call Get method of User object
	}

	@Override
	public List<User> getAllUsers() {

		return userDao.findAll();
	}

}
