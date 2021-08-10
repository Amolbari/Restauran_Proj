package com.intelliatech.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intelliatech.entity.Item;
import com.intelliatech.exception.ItemListNotFoundException;
import com.intelliatech.repo.ItemRepogitory;
import com.intelliatech.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{

	@Autowired
	private ItemRepogitory itemrepo;
	
	@Override
	public Item add(Item item) {
		// TODO Auto-generated method stub
		return itemrepo.save(item);
	}

	@Override
	public List<Item> gettAllItem() {
		List<Item> item=itemrepo.findAll();
		
		if(item.isEmpty()) {
 	throw new ItemListNotFoundException("ItemList is empty"); 
	}
		return item;
	}

	@Override
	public Item getOneItem(int item) {
		
	return itemrepo.findById(item).get();
	}

	@Override
	public List<Item> getItemByname(String item) {
	            
		return itemrepo.getItemByname(item);
	}
	
	

}
