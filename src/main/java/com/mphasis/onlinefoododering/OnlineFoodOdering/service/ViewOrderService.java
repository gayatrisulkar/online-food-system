package com.mphasis.onlinefoododering.OnlineFoodOdering.service;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mphasis.onlinefoododering.OnlineFoodOdering.dao.OrderRepository;
import com.mphasis.onlinefoododering.OnlineFoodOdering.model.ViewOrders;

@Service
public class ViewOrderService {
	
	@Autowired
	//TransactionsRepository transactionsRepository;
	//ItemsRepository itemsRepository;
	OrderRepository orderRep;
	
	@Transactional
    public List<ViewOrders> fetchorders() {
	// TODO Auto-generated method stub
	List<ViewOrders> orderList=orderRep.findAll();
	return orderList;
	}
	
	@Transactional
	public ViewOrders saveorder(ViewOrders view) {
		
		return orderRep.save(view);
		
	}
	@Transactional
	public void updateorder(ViewOrders view) {
		orderRep.save(view);	
	
	}
	
	@Transactional
	public void deleteorder(int orderid) {
		//empRepository.delete(emp);	
		System.out.println("service method called");
		orderRep.deleteById(orderid);
	
	}
	@Transactional 
	  public ViewOrders getorder(int orderid) { 
	  Optional<ViewOrders> optional= orderRep.findById(orderid);
	  ViewOrders vieworder=optional.get();
	  return vieworder;
	  

}

}
