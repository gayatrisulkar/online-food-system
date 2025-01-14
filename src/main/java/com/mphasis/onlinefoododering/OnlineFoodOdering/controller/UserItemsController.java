package com.mphasis.onlinefoododering.OnlineFoodOdering.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.onlinefoododering.OnlineFoodOdering.model.ItemStatus;
import com.mphasis.onlinefoododering.OnlineFoodOdering.service.UserItemService;
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class UserItemsController {
	
	@Autowired
	UserItemService itemService;
	
	@GetMapping("/getItemStatus")
	public List<ItemStatus> getItemStatus() {
		List<ItemStatus> itemList = itemService.fetchItemStatus();
        return itemList;
     }

}
