package com.onlinefoododering.OnlineFoodOdering.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinefoododering.OnlineFoodOdering.model.Menu;
import com.onlinefoododering.OnlineFoodOdering.service.UserMenuService;



@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class UserMenuController {
	
	@Autowired
	UserMenuService userService;
	
	
	@GetMapping("/getAllMenu")
	public List<Menu> getMenu() {
		List<Menu> menuList = userService.fetchMenu();
        return menuList;
     } 
}