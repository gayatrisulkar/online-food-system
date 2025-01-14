package com.mphasis.onlinefoododering.OnlineFoodOdering.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.onlinefoododering.OnlineFoodOdering.dao.ItemsRepository;
import com.mphasis.onlinefoododering.OnlineFoodOdering.dao.TransactionsRepository;
import com.mphasis.onlinefoododering.OnlineFoodOdering.model.ItemStatus;
import com.mphasis.onlinefoododering.OnlineFoodOdering.model.Transactionstatus;


@Service
public class AdminTransactionService {
	
	@Autowired
	TransactionsRepository transactionsRepository;
	ItemsRepository itemsRepository;
	
	
	@Transactional
	public void updateTransaction(Transactionstatus trans) {
		transactionsRepository.save(trans);	
	
	}
	
	@Transactional
	public void updateItemStatus(ItemStatus itemstatus) {
		itemsRepository.save(itemstatus);	
	
	}
	
	@Transactional 
	  public Transactionstatus getTransactions(int id) { 
	  Optional<Transactionstatus> optional= transactionsRepository.findById(id);
	  Transactionstatus trans=optional.get();
	  return trans;
	}
	
	@Transactional
	public Transactionstatus saveTransactionStatus(Transactionstatus trans) {
		
		return transactionsRepository.save(trans);
		
	}
	@Transactional
	public ItemStatus saveItemStatus(ItemStatus itst) {
		
		return itemsRepository.save(itst);
		
	}
	@Transactional 
	  public ItemStatus getItemStatus(int id) { 
	  Optional<ItemStatus> optional= itemsRepository.findById(id);
	  ItemStatus item=optional.get();
	  return item;
	}
	
	

}
