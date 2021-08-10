package com.intelliatech.service;

import com.intelliatech.entity.Category;
import com.intelliatech.exception.CategoryIdNotNotPoundEception;

public interface CategoryService {

	
	
	public Category addcategory(Category category) ;
	
	
	public Category categoryfindbyId(int category_Id)throws CategoryIdNotNotPoundEception;
}
