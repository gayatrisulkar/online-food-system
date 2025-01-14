package com.onlinefoododering.OnlineFoodOdering.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinefoododering.OnlineFoodOdering.dao.TransactionsRepository;
import com.onlinefoododering.OnlineFoodOdering.model.Transactionstatus;
@Service
public class UserTransactionService {
	
	@Autowired
	TransactionsRepository transactionsRepository;
	
 	@Transactional
	public List<Transactionstatus> fetchTransactions() {
		List<Transactionstatus> transactionsList=transactionsRepository.findAll();
		return transactionsList;
	} 
	
	



}
