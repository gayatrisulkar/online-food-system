package com.onlinefoododering.OnlineFoodOdering.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinefoododering.OnlineFoodOdering.model.ViewOrders;


@Repository
public interface OrderRepository extends JpaRepository<ViewOrders,Integer>{

}
