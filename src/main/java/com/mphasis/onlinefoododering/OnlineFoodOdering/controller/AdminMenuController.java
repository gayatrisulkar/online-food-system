package com.mphasis.onlinefoododering.OnlineFoodOdering.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.onlinefoododering.OnlineFoodOdering.exception.ResourceNotFoundException;

import com.mphasis.onlinefoododering.OnlineFoodOdering.service.AdminMenuService;
import com.mphasis.onlinefoododering.OnlineFoodOdering.model.Menu;
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class AdminMenuController {
	
	@Autowired
	AdminMenuService mService;
	
	@GetMapping("/getMenu/{item_id}")
	public ResponseEntity<Menu> getMenuById(@PathVariable("item_id") int item_id)
			throws ResourceNotFoundException {
		Menu menu = mService.getMenu(item_id);
		return ResponseEntity.ok().body(menu);
	}
	
	@PostMapping("/saveMenu")
	public Menu addMenu(@RequestBody Menu m) {

		Menu menu = mService.saveMenu(m);

		// return new ResponseEntity<>("Registration done successfully", HttpStatus.OK);
		return menu;
	}
	
	@PutMapping("/updateMenu/{id}")
	public ResponseEntity<Menu> updateMenu(@PathVariable("id") int menuId,
			@RequestBody Menu menuDetails) throws ResourceNotFoundException {
		Menu menu = mService.getMenu(menuId);

		menu.setItemName(menuDetails.getItemName());
		menu.setItemDescription(menuDetails.getItemDescription());
		menu.setPrice(menuDetails.getPrice());
		menu.setActive(menuDetails.getActive());
		menu.setCategory(menuDetails.getCategory());
		menu.setDateOfLaunch(menuDetails.getDateOfLaunch());
		menu.setFreeDelivery(menuDetails.getFreeDelivery());
		final Menu updatedMenu = mService.saveMenu(menu);
		return ResponseEntity.ok(updatedMenu);
	}
	@DeleteMapping(value = "/deleteMenu/{item_id}")
	public ResponseEntity<Object> deleteMenu(@PathVariable("item_id") int item_id) {

		mService.deleteMenu(item_id);
		return new ResponseEntity<>("Menu deleted successsfully", HttpStatus.OK);
	}


}
