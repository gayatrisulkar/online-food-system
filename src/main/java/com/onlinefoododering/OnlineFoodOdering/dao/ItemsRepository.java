package com.onlinefoododering.OnlineFoodOdering.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinefoododering.OnlineFoodOdering.model.ItemStatus;



@Repository
public interface ItemsRepository extends JpaRepository<ItemStatus,Integer>  {
	
}

