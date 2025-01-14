package com.onlinefoododering.OnlineFoodOdering.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transcations")
public  class Transactionstatus {
	
	@Id
	@GeneratedValue
	@Column(name="transact_id")
	private  int transid;
	
	@Column(name = "user_id", nullable = false, length = 10)
	 private int userid;
     
	@Column(name = "order_id", nullable = false, length = 10)
 	  private int orderid;
     
     @Column(name="trans_date")
	  private  Date transdate;
     
     @Column(name="price")
	  private  int pri;
     
     @Column(name="status")
	  private  String stat;
     
    
     public Transactionstatus(int userid, int orderid, Date transdate, int pri, String stat) {
    	 super();
    	 this.userid=userid;
    	 this.orderid=orderid;
    	 this.transdate=transdate;
    	 this.pri=pri;
    	 this.stat=stat;
    	 
     }
     public  Transactionstatus() {
     	// TODO Auto-generated constructor stub
     	 
      }
      
     
     public  int gettransid() {
 		return transid;
 	}
 	public void settransid(int transid) {
 		this.transid = transid;
 	}
 	
 	public  int getuserid() {
		return userid;
	}
	public void setuserid(int userid) {
		this.userid = userid;
	}
	
	public  int getorderid() {
		return orderid;
	}
	public void setorderid(int orderid) {
		this.orderid = orderid;
	}
	
	public  Date gettransdate() {
		return transdate;
	}
	public void settransdate(Date transdate) {
		this.transdate = transdate;
	}
	
	 public int getpri() {
	 		return pri;
	 }
	 public void setpri(int pri) {
	 		this.pri = pri;
	 }
	 public  String getstat() {
			return stat;
		}
		public  void setstat(String stat) {
			this.stat = stat;
		}

}
