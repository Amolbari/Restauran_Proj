package com.intelliatech.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.intelliatech.entity.Restaurant;
import com.intelliatech.service.RestaurantService;



@RestController
public class RestaurantController {

	@Autowired
	private RestaurantService restservice;
	
	@PostMapping("/saveRestaurant")
	public Restaurant saveRestaurant(@RequestBody Restaurant restaurant) {
		
		System.out.println(restaurant.getRestaurant_Name());
		return restservice.addRestaurant(restaurant);
		
	}
	
	@GetMapping("/getrestaurant")
	public List<Restaurant> getall(){
	
	return restservice.gettAllrestaurant(); 
	}
	
	
	
	@GetMapping("/getone/{Id}")
	public Restaurant getone(@PathVariable("Id") int rest_Id) {

	return restservice.getonerestaurant(rest_Id);
	}
}
