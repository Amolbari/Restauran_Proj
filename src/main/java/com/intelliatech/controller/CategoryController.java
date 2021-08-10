package com.intelliatech.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public ResponseEntity<?> savecategory(@RequestBody Category category)
	{
		
		return categoryservice.addcategory(category);
		
	}
	@GetMapping("/getbyid/{id}")
	public Optional<Category> getonecategorybyid(@PathVariable("id") int category_id)
	{
		return categoryservice.categoryfindbyId(category_id);
	}	
	
	@GetMapping("/getbyname/{name}")
	public List<Category> getcategory(@PathVariable("name") String name) {
		return categoryservice.findBycategory(name);
	}
	
	
}
