package com.thoughtworks.ddd_workshop.domain;

import java.util.Currency;

public class Product {
	
	private String name;
	
	private Price price;

	public Product(String name) {
		this.name=name;
	}

	
	public Product(String name,Price price) {
		this(name);
		this.price=price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Price getPrice() {
		return price;
	}


	public void setPrice(Price price) {
		this.price = price;
	}


}
