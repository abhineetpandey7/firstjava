package com.wipro.unittesting.unittesting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.unittesting.unittesting.business.ItemFromBusinessService;
import com.wipro.unittesting.unittesting.model.Item;

@RestController
public class ItemController {
    
	@Autowired
	private ItemFromBusinessService businessService;
	@GetMapping("/dummy-item")
	public Item dummyItem() {
		
		return new Item(1,"Ball",10,100);
	}
	@GetMapping("/item-from-business-service")
	public Item dummyItemFromBusinessService() {
		
		return businessService.retreiveHardcodedItem();
	}
}
