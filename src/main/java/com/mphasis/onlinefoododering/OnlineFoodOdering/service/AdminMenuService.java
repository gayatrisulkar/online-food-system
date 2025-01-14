package com.mphasis.onlinefoododering.OnlineFoodOdering.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mphasis.onlinefoododering.OnlineFoodOdering.dao.MenuRepository;
import com.mphasis.onlinefoododering.OnlineFoodOdering.model.Menu;


@Service
public class AdminMenuService {

	@Autowired
	MenuRepository mRepository;
	
	@Transactional
	public List<Menu> fetchMenu() {
		List<Menu> mList=mRepository.findAll();
		return mList;
		
	}
	@Transactional
	public Menu saveMenu(Menu menu) {
		
		return mRepository.save(menu);
		
	}
	@Transactional
	public void updateMenu(Menu m) {
		mRepository.save(m);	
	
	}
	
	@Transactional
	public void deleteMenu(int item_id) {
		//empRepository.delete(m);	
		System.out.println("service method called");
		mRepository.deleteById(item_id);
	
	}
	@Transactional 
	  public Menu getMenu(int id) { 
	  Optional<Menu> optional= mRepository.findById(id);
	  Menu m=optional.get();
	  return m;
	  

}
}
