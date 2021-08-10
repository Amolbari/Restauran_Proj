package com.intelliatech.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity

public class Menucard {

	
	@Id
	@GeneratedValue
	private Integer menucard_Id;
	private String menucard_Name;
	
	
	@ManyToOne
	@JoinColumn(name="Rest_Id")
	private Restaurant rest;


	public Integer getMenucard_Id() {
		return menucard_Id;
	}


	public void setMenucard_Id(Integer menucard_Id) {
		this.menucard_Id = menucard_Id;
	}


	public String getMenucard_Name() {
		return menucard_Name;
	}


	public void setMenucard_Name(String menucard_Name) {
		this.menucard_Name = menucard_Name;
	}


	public Restaurant getRest() {
		return rest;
	}


	public void setRest(Restaurant rest) {
		this.rest = rest;
	}


	public Menucard(Integer menucard_Id, String menucard_Name, Restaurant rest) {
		super();
		this.menucard_Id = menucard_Id;
		this.menucard_Name = menucard_Name;
		this.rest = rest;
	}


	public Menucard() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}