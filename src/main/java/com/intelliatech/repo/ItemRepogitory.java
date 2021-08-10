package com.intelliatech.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.intelliatech.entity.Item;

public interface ItemRepogitory extends JpaRepository<Item, Integer> {
	// abstract method in repo
	@Query(value = "select i from Item i where i.itemName =:n")
	public List<Item> findByitemName(@Param ("n") String name);

	
	@Query(value="Select j from Item j where j.itemName =:m ",nativeQuery = true)
	public List<Item> findByname(@Param("m") String name);

	/*@Query("select * from Item i")
public List<Item> findeByAll();*/
}
