package com.onlinefoododering.OnlineFoodOdering.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinefoododering.OnlineFoodOdering.model.Transactionstatus;

@Repository
public interface TransactionsRepository extends JpaRepository<Transactionstatus,Integer>  {
	
}
