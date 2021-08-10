package com.intelliatech.repo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.intelliatech.entity.Item;


public interface ItemRepogitory extends JpaRepository<Item, Integer> {
	//abstract method in repo
	
	@Query("Select * form item i where i.item_name=?1")
	public List<Item> getItemByname(String item);

}
