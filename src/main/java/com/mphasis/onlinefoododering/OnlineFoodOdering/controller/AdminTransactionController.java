package com.mphasis.onlinefoododering.OnlineFoodOdering.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.onlinefoododering.OnlineFoodOdering.exception.ResourceNotFoundException;
import com.mphasis.onlinefoododering.OnlineFoodOdering.model.Transactionstatus;
import com.mphasis.onlinefoododering.OnlineFoodOdering.service.AdminTransactionService;


@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class AdminTransactionController {
	
	@Autowired
	AdminTransactionService tranService;
	@PutMapping("/updateTransactionStatus/{trans_id}")
	public ResponseEntity<Transactionstatus> updateTransaction(@PathVariable("trans_id") int trans_id,
			@RequestBody Transactionstatus transactionDetails) throws ResourceNotFoundException {
		Transactionstatus transactions = tranService.getTransactions(trans_id);

		transactions.setuserid(transactionDetails.getuserid());
		transactions.setorderid(transactionDetails.getorderid());
		transactions.settransdate(transactionDetails.gettransdate());
		transactions.setpri(transactionDetails.getpri());
		transactions.setstat(transactionDetails.getstat());
		final Transactionstatus updateTransactions = tranService.saveTransactionStatus(transactions);
		return ResponseEntity.ok(updateTransactions);
	}
	
	
}

