package com.springboot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
	
//	List<Item> list=new ArrayList<>();
	@RequestMapping("api/items")
	public List<Item> retrieveAllCourse() {
	return Arrays.asList(
			new Item(1, "apurvva"),
			new Item(2, "jaya")
			);	
	}
	 
//	@GetMapping
//	public List<Item> getItems(){
//		return list;
//	}
//	
//	@PostMapping
//	public String addItem(@RequestBody Item newitem) {
//		list.add(newitem);
//		return "Item Added!";
//	}
//	
//	
//	@DeleteMapping("/items/{id}")
//	public String deleteItem(@PathVariable Long id) {
//		list.removeIf(item->item.getId().equals(id));
//		return "item deleted!";
		
	}
	
