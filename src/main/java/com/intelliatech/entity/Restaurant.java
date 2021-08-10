package com.intelliatech.entity;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Restaurant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer restaurant_Id;
	private String restaurant_Name;
	

	@OneToMany(mappedBy = "rest", cascade =CascadeType.ALL,fetch=FetchType.LAZY)
private List<Menucard> menu;


	public Integer getRestaurant_Id() {
		return restaurant_Id;
	}


	public void setRestaurant_Id(Integer restaurant_Id) {
		this.restaurant_Id = restaurant_Id;
	}


	public String getRestaurant_Name() {
		return restaurant_Name;
	}


	public void setRestaurant_Name(String restaurant_Name) {
		this.restaurant_Name = restaurant_Name;
	}


	public List<Menucard> getMenu() {
		return menu;
	}


	public void setMenu(List<Menucard> menu) {
		this.menu = menu;
	}


	public Restaurant(Integer restaurant_Id, String restaurant_Name, List<Menucard> menu) {
		super();
		this.restaurant_Id = restaurant_Id;
		this.restaurant_Name = restaurant_Name;
		this.menu = menu;
	}


	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	
}