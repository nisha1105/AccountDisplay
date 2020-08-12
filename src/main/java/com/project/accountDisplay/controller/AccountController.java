package com.project.accountDisplay.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.accountDisplay.dao.AccountDao;
import com.project.accountDisplay.dao.TransactionDao;
import com.project.accountDisplay.dto.Account;
import com.project.accountDisplay.dto.Transaction;

@RestController
@RequestMapping(path = "/account")
public class AccountController {

	@Autowired
	private AccountDao accountDao;

	@Autowired
	private TransactionDao transactionDao;

	@RequestMapping(path = "/accountList", produces = "application/json")
	public ArrayList<Account> getAccounts() {
		return (ArrayList<Account>) accountDao.getAllAccounts();
	}

	@RequestMapping(path = "/transactionList", produces = "application/json")
	public ArrayList<Transaction> getTransactions(@RequestParam(name = "id") String accountNumber) {
		return (ArrayList<Transaction>) transactionDao.getTransactionsforAccount(accountNumber);
	}
}
