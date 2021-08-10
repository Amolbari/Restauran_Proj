package com.intelliatech.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Integer category_Id;
private String category;

@ManyToOne
@JoinColumn(name="Item_Id")
private Item item;

public Integer getCategory_Id() {
	return category_Id;
}

public void setCategory_Id(Integer category_Id) {
	this.category_Id = category_Id;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public Item getItem() {
	return item;
}

public void setItem(Item item) {
	this.item = item;
}

public Category(Integer category_Id, String category, Item item) {
	super();
	this.category_Id = category_Id;
	this.category = category;
	this.item = item;
}

public Category() {
	super();
	// TODO Auto-generated constructor stub
}



}
