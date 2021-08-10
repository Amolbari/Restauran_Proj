package com.intelliatech.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intelliatech.entity.Restaurant;
import com.intelliatech.repo.RestaurantRepogitory;
import com.intelliatech.service.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService{

	@Autowired
	private RestaurantRepogitory restrepo;
	@Override
	public Restaurant addRestaurant(Restaurant restaurant) {
		return restrepo.save(restaurant);
	}
	@Override
	public List<Restaurant> gettAllrestaurant() {
		
		return restrepo.findAll();
	}
	@Transactional
	@Override
	public Restaurant getonerestaurant(int rest_Id) {
		// TODO Auto-generated method stub
		return restrepo.findById(rest_Id).get();
	}

}
