package com.demo.service;

import java.util.List;

import com.demo.entity.Account;

public interface AccountService {
	
	Account addAccount(Account account);  // add Account abstract Method
	
	Account updateAccount(Account accountId);  //update Account by id
	
	void deleteAccount(Integer accountId);    //Delete Account by id
	
	Account getAccountDetail(Integer accountId);  // Single Account by Account Id
	
	List<Account> getAccounts();  // Fetch All Account Details;
	

}
