package com.onlinefoododering.OnlineFoodOdering.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinefoododering.OnlineFoodOdering.model.Cart;


@Repository
public interface CartRepository extends JpaRepository<Cart ,Integer> {

	
}