package com.thoughtworks.ddd_workshop.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cart {
	
	private List<Item> items;
	private List<Item> removeditems;
	private UUID cartId;

	public Cart() {
		super();
		this.cartId = UUID.randomUUID();
		
		this.items = new ArrayList<Item>();
		this.removeditems = new ArrayList<Item>();
	}

	public List<Item> getItems() {
		return items;
	}

	public void addItems(Item item) {
		this.items.add(item);
	}

	
	public void removeItem(Product product) {
		//this.items.remove(item);
		Item itemToBeRemoved = null;
		
		for(Item item: items) {
			if(item.getProduct().getName().equalsIgnoreCase(product.getName())) {
				itemToBeRemoved = item;
				break;
			}
		}
		removeditems.add(itemToBeRemoved);
		items.remove(itemToBeRemoved);
	}
	
	public List<Item> getRemovedItems(){
		return this.removeditems;
	}

}
