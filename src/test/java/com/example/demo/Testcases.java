package com.example.demo;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.intelliatech.entity.Item;
import com.intelliatech.repo.ItemRepogitory;

@SpringBootTest

public class Testcases {

	
	@Autowired
	private ItemRepogitory itemrepo;
	
	@Test
	public void testcasesTOFindeAll() 
	{
		Item item = new Item();
		item.setItemId(1);
		item.setItemName("dhosa");
		item.setItemPrice(60.00);
		itemrepo.save(item);
		assertNotNull(itemrepo.findAll());
		
	}
	
	
	
	
	
	
	
	
	public Testcases() {
		// TODO Auto-generated constructor stub
	}

}
