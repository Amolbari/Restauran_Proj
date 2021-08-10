package com.intelliatech.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intelliatech.entity.Category;

public interface CategoryRepogitory extends JpaRepository<Category, Integer> {

	
}
