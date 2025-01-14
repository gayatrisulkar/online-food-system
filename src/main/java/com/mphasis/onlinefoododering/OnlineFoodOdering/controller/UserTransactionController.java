package com.mphasis.onlinefoododering.OnlineFoodOdering.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.onlinefoododering.OnlineFoodOdering.model.Transactionstatus;

import com.mphasis.onlinefoododering.OnlineFoodOdering.service.UserTransactionService;


@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class UserTransactionController {
	
	@Autowired
	UserTransactionService userService;
	
	
	@GetMapping("/getAllTransactions")
	public List<Transactionstatus> getTransactions() {
		List<Transactionstatus> transactionList = userService.fetchTransactions();
        return transactionList;
     }  
	

	
	
	
	
	
		
		


}
