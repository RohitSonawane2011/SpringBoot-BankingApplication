package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Account;

public interface AccountDao extends JpaRepository<Account, Integer>{

}
