package com.onlinefoododering.OnlineFoodOdering.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinefoododering.OnlineFoodOdering.model.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu,Integer>  {
	
}
