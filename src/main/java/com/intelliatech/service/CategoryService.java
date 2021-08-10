package com.intelliatech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.intelliatech.entity.Category;
import com.intelliatech.exception.CategoryIdNotNotPoundEception;
import com.intelliatech.exception.IsEmptyException;

public interface CategoryService {

	
	
	public ResponseEntity<?> addcategory(Category category) throws IsEmptyException ;
	
	
	public Optional<Category> categoryfindbyId(int category_Id)throws CategoryIdNotNotPoundEception;
//	public Category categoryfindbyId(int category_Id)throws CategoryIdNotNotPoundEception;
	
	 public List<Category> findBycategory(String category)throws CategoryIdNotNotPoundEception;


}
