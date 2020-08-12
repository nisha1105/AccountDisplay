package com.project.accountDisplay.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.accountDisplay.dto.Account;

@SuppressWarnings("deprecation")
@Repository
public class AccountDao {

	private List<Account> list = new ArrayList<>();

	public void setAllAccounts(){
	        list.add(new Account("1", "Alex", "Savings", new Date(12, 9, 2020), "USD",12456.50));
	        list.add(new Account("2", "David", "Savings", new Date(14, 6, 2017), "AUD",12465456.00));
	        list.add(new Account("3", "Max", "Savings", new Date(21, 12, 1990), "SGD",1454665.50));        
	    }
	 
	public List<Account> getAllAccounts() {
		return list;
	}

}
