package com.domain.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	private List<Product> products;
	
	

	public Cart() {
		super();
		this.products = new ArrayList<Product>();
	}

	public List<Product> getProducts() {
		return products;
	}

	public void addProducts(Product product) {
		this.products.add(product);
	}
	
	
	

}
