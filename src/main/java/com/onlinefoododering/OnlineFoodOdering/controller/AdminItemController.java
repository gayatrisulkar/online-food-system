package com.onlinefoododering.OnlineFoodOdering.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinefoododering.OnlineFoodOdering.exception.ResourceNotFoundException;
import com.onlinefoododering.OnlineFoodOdering.model.ItemStatus;
import com.onlinefoododering.OnlineFoodOdering.service.AdminItemService;
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class AdminItemController {
	
	@Autowired
	AdminItemService itemService;
	
	@PutMapping("/updateItemStatus/{orderid}")
	public ResponseEntity<ItemStatus> updateItemStatus(@PathVariable("orderid") int orderid,
			@RequestBody ItemStatus itemDetails) throws ResourceNotFoundException {
		ItemStatus item = itemService.getItemStatus(orderid);
		item.setorderid(itemDetails.getorderid());
		item.setstat(itemDetails.getstat());
		final ItemStatus updateItemStatus = itemService.saveItemStatus(item);
		return ResponseEntity.ok(updateItemStatus);
	}


}
