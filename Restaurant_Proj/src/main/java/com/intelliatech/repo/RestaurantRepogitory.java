package com.intelliatech.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intelliatech.entity.Restaurant;

public interface RestaurantRepogitory extends JpaRepository<Restaurant, Integer> {

	

}
