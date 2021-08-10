package com.intelliatech.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intelliatech.entity.Category;
import com.intelliatech.repo.CategoryRepogitory;
import com.intelliatech.service.CategoryService;

@Service
public class Category_ServiceImpl implements CategoryService{

@Autowired
private CategoryRepogitory categoryrepo;

@Override
public Category addcategory(Category category) {
	// TODO Auto-generated method stub
	return  categoryrepo.save(category);
}

@Override
public Category categoryfindbyId(int category_Id) {
	
	return categoryrepo.findById(category_Id).get();
}

		
		
	
}
