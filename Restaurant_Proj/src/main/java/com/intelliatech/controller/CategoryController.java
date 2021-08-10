package com.intelliatech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.intelliatech.entity.Category;
import com.intelliatech.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService categoryservice;
	
	
	@PostMapping("/addcategory")
	public Category savecategory(@RequestBody Category category)
	{
		
		return categoryservice.addcategory(category);
		
	}
	@GetMapping("/getbyid/{id}")
	public Category getonecategorybyid(int category_id)
	{
		return categoryservice.categoryfindbyId(category_id);
	}	
	
}
