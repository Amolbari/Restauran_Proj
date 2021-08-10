package com.intelliatech.serviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.intelliatech.entity.Category;
import com.intelliatech.exception.CategoryIdNotNotPoundEception;
import com.intelliatech.exception.IsEmptyException;
import com.intelliatech.repo.CategoryRepogitory;
import com.intelliatech.service.CategoryService;

@Service
public class Category_ServiceImpl implements CategoryService{

@Autowired
private CategoryRepogitory categoryrepo;

@Override
public ResponseEntity<String> addcategory(Category category) {
	// TODO Auto-generated method stub
	if(category.getCategory() == null || category.getCategory().isEmpty() )
		throw new IsEmptyException("category is empty"); 
	categoryrepo.save(category);
	return  new ResponseEntity<String>("Add data succesfully",HttpStatus.OK);
}

@Override
public Optional<Category> categoryfindbyId(int category_Id) {
	// TODO Auto-generated method stub
	
	
	Optional<Category>category=categoryrepo.findById(category_Id);
	if(category.isPresent()){
	return category;
	}
	else 
	throw new  CategoryIdNotNotPoundEception("Not pregent in category");
	
	
}

@Override
public List<Category> findBycategory(String category){
	// TODO Auto-generated method stub

/*List<Category> cate= categoryrepo.findBycategory(category);
cate.stream().filter(p->p.getCategory()==category).collect(Collectors.toList());

System.out.println(cate);*/
	return  categoryrepo.findBycategory(category);
}







		
		
	
}

