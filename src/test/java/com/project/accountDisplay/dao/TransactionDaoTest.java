package com.project.accountDisplay.dao;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TransactionDaoTest {

	@Autowired
	private TransactionDao transactionDao;

	@Test
	void getAccount() {
		transactionDao.setTransactionsforAccount();
		assertThat(transactionDao.getTransactionsforAccount("1").size() == 3);

	}

}
