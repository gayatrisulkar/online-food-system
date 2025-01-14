package com.mphasis.onlinefoododering.OnlineFoodOdering.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="menu")
public class Menu {
	@Id
	
	@Column(name="item_id")
	private int id;
	
	@Column(name="item_name")
	private String itemName;
	
	@Column(name="item_description")
	private String itemDescription;
		
	@Column(name="price")
	private int price;
	
	@Column(name="active")
	private String active;
	
	@Column(name="category")
	private String category;
	
	@Column(name="date_of_launch")
	private Date dateOfLaunch;
	
	@Column(name="free_delivery")
	private String freeDelivery;
	
	public Menu(String itemName, String itemDescription, int price, String active, String category, Date dateOfLaunch, String freeDelivery) {
        super();
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.price = price;
        this.active = active;
        this.category = category;
        this.dateOfLaunch = dateOfLaunch;
        this.freeDelivery = freeDelivery;
    }
	public Menu() {
		// TODO Auto-generated constructor stub
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Date getDateOfLaunch() {
		return dateOfLaunch;
	}
	public void setDateOfLaunch(Date dateOfLaunch) {
		this.dateOfLaunch = dateOfLaunch;
	}
	public String getFreeDelivery() {
		return freeDelivery;
	}
	public void setFreeDelivery(String freeDelivery) {
		this.freeDelivery = freeDelivery;
	}

}
