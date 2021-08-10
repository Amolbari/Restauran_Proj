package com.intelliatech.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intelliatech.entity.Menucard;
import com.intelliatech.repo.MenucardRepogitory;
import com.intelliatech.service.MenucardService;

@Service
public class MenucardServiceImpl implements MenucardService {
@Autowired
public MenucardRepogitory repo;
	@Override
	public Menucard savemenu(Menucard mcard) {
		// TODO Auto-generated method stub
		
		
		return repo.save(mcard);
	}

}
