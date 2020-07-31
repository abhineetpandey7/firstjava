package com.wipro.unittesting.unittesting.business;

import org.springframework.stereotype.Service;

import com.wipro.unittesting.unittesting.model.Item;

@Service
public class ItemFromBusinessService {

	public Item retreiveHardcodedItem() {
		// TODO Auto-generated method stub
		return new Item(1,"Ball",10,100);
	}

}
