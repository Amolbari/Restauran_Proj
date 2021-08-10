package com.intelliatech.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.intelliatech.entity.Category;

public interface CategoryRepogitory extends JpaRepository<Category, Integer> {

	@Query("select c.category from Category c where c.category=:category")
      public List<Category> findBycategory(String category);

}
