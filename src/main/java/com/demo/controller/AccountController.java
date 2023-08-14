package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dao.AccountDao;
import com.demo.entity.Account;

@RestController
@RequestMapping("api/account")
public class AccountController {
	
	@Autowired
	public AccountDao accountDao;
	
	@PostMapping("/")
	Account addAccount(@RequestBody Account account) {
		
		return accountDao.save(account);
	}

}
