package com.project.accountDisplay.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.project.accountDisplay.dto.Transaction;

@SuppressWarnings("deprecation")
@Repository
public class TransactionDao {

	private List<Transaction> list ;
	private Map<String,List<Transaction>> map = new HashMap<>();
	
	public void setTransactionsforAccount() {
		list= new ArrayList<>();
		list.add(new Transaction("1", "Alex", new Date(12,9,2010), "USD", 12.50,
			0, "Debit", null));
		list.add(new Transaction("1", "Alex", new Date(11,9,2010), "USD", 0,
				123.0, "Credit", null));
		list.add(new Transaction("1", "Alex", new Date(10,9,2010), "USD", 192.50,
				0, "Debit", null));
		map.put("1", list);
		list= new ArrayList<>();
		list.add(new Transaction("2", "David", new Date(12,9,2010), "USD", 12.50,
				0, "Debit", null));
		list.add(new Transaction("2", "David", new Date(11,9,2010), "USD", 0,
					123.0, "Credit", null));
		list.add(new Transaction("2", "David", new Date(10,9,2010), "USD", 192.50,
					0, "Debit", null));
		
		map.put("2", list);			
	}

	public List<Transaction> getTransactionsforAccount(String id) {
		return map.get(id);
	}
}
