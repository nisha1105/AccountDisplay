package com.project.accountDisplay.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AccountDaoTest {

	@Autowired
	private AccountDao accountDao;

	@Test
	void getAccount() {
		accountDao.setAllAccounts();
		assertEquals(3, accountDao.getAllAccounts().size());
		
	}

}
