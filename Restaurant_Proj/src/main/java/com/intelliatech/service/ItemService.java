package com.intelliatech.service;

import java.util.List;

import com.intelliatech.entity.Item;
import com.intelliatech.exception.ItemListNotFoundException;
import com.intelliatech.exception.ItemNotFoundEcxeption;

public interface ItemService {
	
	
	public Item add(Item item);
	
	public List<Item> gettAllItem()throws ItemListNotFoundException;
	
	public Item getOneItem(int item) throws ItemNotFoundEcxeption;
	
	public List<Item> getItemByname(String item);
	

}
