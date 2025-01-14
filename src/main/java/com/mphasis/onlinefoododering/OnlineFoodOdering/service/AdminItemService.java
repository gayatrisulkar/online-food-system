package com.mphasis.onlinefoododering.OnlineFoodOdering.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.onlinefoododering.OnlineFoodOdering.dao.ItemsRepository;
import com.mphasis.onlinefoododering.OnlineFoodOdering.model.ItemStatus;

@Service
public class AdminItemService {
	
	@Autowired
	ItemsRepository itemsRepository;
	
	@Transactional
	public void updateItemStatus(ItemStatus itemstatus) {
		itemsRepository.save(itemstatus);	
	
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
