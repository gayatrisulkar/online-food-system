package com.onlinefoododering.OnlineFoodOdering.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item_status")


public class ItemStatus {
	 @Id
	 @Column(name = "order_id", nullable = false, length = 10)
	private int orderid;
	
    @Column(name="status")
	private String stat;
    
    public ItemStatus() {
    	
    }
    
    public ItemStatus(int orderid, String stat) {
    	super();
    	this.orderid=orderid;
    	this.stat=stat;
    }
    
    public int getorderid() {
		return orderid;
	}
	public void setorderid(int orderid) {
		this.orderid = orderid;
	}
	
	public String getstat() {
		return stat;
	}
	public void setstat(String stat) {
		this.stat = stat;
	}


}

