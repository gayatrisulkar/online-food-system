package com.onlinefoododering.OnlineFoodOdering.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinefoododering.OnlineFoodOdering.dao.ItemsRepository;
import com.onlinefoododering.OnlineFoodOdering.model.ItemStatus;

@Service
public class UserItemService {
	
	@Autowired
	ItemsRepository itemsRepository;
	
	@Transactional
	public List<ItemStatus> fetchItemStatus() {
		List<ItemStatus> itemStatusList=itemsRepository.findAll();
		return itemStatusList;
	}
	

}
