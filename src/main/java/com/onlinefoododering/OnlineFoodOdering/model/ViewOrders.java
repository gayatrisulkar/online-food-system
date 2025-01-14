package com.onlinefoododering.OnlineFoodOdering.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class ViewOrders {
	
	@Id
	@Column(name="order_id")
	  private int orderid;
	@Column(name = "user_id", nullable = false, length = 10)
	  private int userid;//fk
	@Column(name="total_price")
	  private int totalprice;
	@Column(name="order_date")
	  private Date orderdate;
	
	
	
	public ViewOrders(int orderid,int userid,int totalprice,Date orderdate) {
		this.orderid=orderid;
		this.userid=userid;
		this.totalprice=totalprice;
		this.orderdate=orderdate;
	}
     public ViewOrders() {
    	// TODO Auto-generated constructor stub
	}
	
	 public  int getorderid() {
	 		return orderid;
	 	}
	 public void setorderid(int orderid) {
			this.orderid = orderid;
		}
	 
	 
	 public  int getuserid() {
			return userid;
		}
		public void setuserid(int userid) {
			this.userid = userid;
		}
		
		
		public  int gettotalprice() {
			return totalprice;
		}
		public void settotalprice(int totalprice) {
			this.totalprice = totalprice;
		}
		public Date getorderdate() {
			return orderdate;
		}
		
		public void setorderdate(Date orderdate) {
			this.orderdate=orderdate;
		}
		

}