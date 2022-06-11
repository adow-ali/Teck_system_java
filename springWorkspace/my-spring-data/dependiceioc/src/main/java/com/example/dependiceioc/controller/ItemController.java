package com.example.dependiceioc.controller;

import org.springframework.web.bind.annotation.GetMapping;

import com.example.dependiceioc.entity.ItemRepo;

@Controller
public class ItemController {
	
	//Contstructor Dependency Injection
	private ItemRepo itemRepo;
	ItemController(ItemRepo itemRepo){
		this.itemRepo=itemRepo;
	}
	
	
	
	@GetMapping(path="/")
	public String show() {
		return "Hello to all";
	}

}
