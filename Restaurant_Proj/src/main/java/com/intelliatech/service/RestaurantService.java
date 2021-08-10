package com.intelliatech.service;

import java.util.List;

import com.intelliatech.entity.Restaurant;

public interface RestaurantService {
	
	public Restaurant addRestaurant(Restaurant restaurant);
	public List< Restaurant> gettAllrestaurant();
public  Restaurant getonerestaurant(int rest_Id);

}
