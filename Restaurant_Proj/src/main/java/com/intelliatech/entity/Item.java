package com.intelliatech.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer item_Id;
	private String item_Name;
	private double item_Price;
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "item",fetch = FetchType.LAZY)
	//@JoinColumn(name="category_Id")
     private List<Category> category;

	public Integer getItem_Id() {
		return item_Id;
	}

	public void setItem_Id(Integer item_Id) {
		this.item_Id = item_Id;
	}

	public String getItem_Name() {
		return item_Name;
	}

	public void setItem_Name(String item_Name) {
		this.item_Name = item_Name;
	}

	public double getTem_Price() {
		return item_Price;
	}

	public void setTem_Price(double tem_Price) {
		this.item_Price = tem_Price;
	}

	public List<Category> getCategory() {
		return category;
	}

	public void setCategory(List<Category> category) {
		this.category = category;
	}

	public Item(Integer item_Id, String item_Name, double tem_Price, List<Category> category) {
		super();
		this.item_Id = item_Id;
		this.item_Name = item_Name;
		this.item_Price = tem_Price;
		this.category = category;
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}





}
