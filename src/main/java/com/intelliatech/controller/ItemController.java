package com.intelliatech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.intelliatech.entity.Item;
import com.intelliatech.service.ItemService;

@RestController
public class ItemController {

	@Autowired
	private ItemService itemservice;

	@PostMapping("/add")
	public Item additem(@RequestBody Item item) {

		return itemservice.add(item);
	}

	@GetMapping("/get")
	public List<Item> getAll() {

		return itemservice.gettAllItem();
	}

	@GetMapping("/getoneitem/{id}")

	public Item getbyid(@PathVariable("id") int itemid) {

		return itemservice.getOneItem(itemid);
	}

	/*
	 * @GetMapping("/getitem/{name}") public List<Item>
	 * getitem(@PathVariable("name") String item){ return
	 * itemservice.findbyitem(item); }
	 */

	@GetMapping("/getitem/{name}")
	public List<Item> getitem(@PathVariable("name") String item) {
		return itemservice.findByname(item);

	}
}
