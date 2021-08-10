package com.intelliatech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.intelliatech.entity.Menucard;
import com.intelliatech.service.MenucardService;

@RestController
public class MenucardController {

	@Autowired
	private MenucardService cardservice;
	
	@PostMapping("/save")
	public Menucard savemenu(@RequestBody Menucard mcard)
	{
		return cardservice.savemenu(mcard);
		
	}
	
	
	
	
}
