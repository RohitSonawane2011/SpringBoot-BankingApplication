package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.AccountDao;
import com.demo.entity.Account;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired // Injecting Account Dao Object
	private AccountDao accountDao;

	@Override
	public Account addAccount(Account account) {

		return accountDao.save(account); // Directly Returned
	}

	@Override
	public Account updateAccount(Account accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAccount(Account accountId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Account getAccountDetail(Account accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account getAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

}
