package com.mphasis.onlinefoododering.OnlineFoodOdering.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mphasis.onlinefoododering.OnlineFoodOdering.dao.MenuRepository;
import com.mphasis.onlinefoododering.OnlineFoodOdering.model.Menu;

@Service
public class UserMenuService {
	
	@Autowired
	MenuRepository menuRepository;
	
 	@Transactional
	public List<Menu> fetchMenu() {
		List<Menu> menuList=menuRepository.findAll();
		return menuList;
	} 
	
	



}
