package com.intelliatech.serviceimpl;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intelliatech.entity.Item;
import com.intelliatech.exception.ItemListNotFoundException;
import com.intelliatech.exception.ItemNameNotfoundException;
import com.intelliatech.exception.ItemNotFoundEcxeption;
import com.intelliatech.repo.ItemRepogitory;
import com.intelliatech.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepogitory itemrepo;

	@Override
	public Item add(Item item) {
		// TODO Auto-generated method stub
		return itemrepo.save(item);
	}

	@Override
	public List<Item> gettAllItem() {
		List<Item> item = itemrepo.findAll();

		if (item.isEmpty()) {
			throw new ItemListNotFoundException("ItemList is empty");
		}
		return item;
	}

	@Override
	public Item getOneItem(int item) {

		return itemrepo.findById(item).get();
	}

/*	@Override
	public List<Item> findbyitem(String name) {

		List<Item> il = itemrepo.findByitemName(name);
		System.out.println(il);

	for (Item item : il) {

			if (item.getItemName()== name) {
				throw new ItemNameNotfoundException("Not find name in list");
			}

		}
		return il;
	}


	 * if(il.size()<=0) { throw new
	 * ItemNameNotfoundException("Value is not pregent"); }
	 */
		
		//return il;
	//}

	@Override
	public List<Item> findByname(String name) throws ItemNotFoundEcxeption {
		
		List <Item> list= itemrepo.findByname(name).stream().filter(p->p.getItemName()==name).collect(Collectors.toList());
		System.out.println(list);
		return list;
	}
	}
