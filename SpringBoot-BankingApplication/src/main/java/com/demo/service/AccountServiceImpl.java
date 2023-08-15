package com.demo.service;

import java.util.List;
import java.util.Optional;

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
	public Account updateAccount(Account account) {
		Account exAccount = accountDao.findById(account.getAccountId()).get();
		exAccount.setBrachName(account.getBrachName());
		exAccount.setAccountType(account.getAccountType());
		exAccount.setAccountBalance(account.getAccountBalance());
		
		Account newAccount = accountDao.save(exAccount);
		return newAccount;
	}

	@Override
	public void deleteAccount(Integer accountId) {
		accountDao.deleteById(accountId);	

	}

	@Override
	public Account getAccountDetail(Integer accountId) {
		Optional<Account> exAccount = accountDao.findById(accountId);
		return exAccount.get();
	}

	@Override
	public List<Account> getAccounts() {

		return accountDao.findAll();
	}

}
