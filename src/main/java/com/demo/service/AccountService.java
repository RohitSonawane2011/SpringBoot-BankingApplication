package com.demo.service;

import com.demo.entity.Account;

public interface AccountService {
	
	Account addAccount(Account accountId);  // add Account abstract Method
	
	Account updateAccount(Account accountId);  //update Account by id
	
	void deleteAccount(Account accountId);    //Delete Account by id
	
	Account getAccountDetail(Account accountId);  // Single Account by Account Id
	
	Account getAccounts();  // Fetch All Account Details;
	

}
