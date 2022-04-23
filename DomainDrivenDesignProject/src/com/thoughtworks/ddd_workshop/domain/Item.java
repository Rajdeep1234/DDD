package com.thoughtworks.ddd_workshop.domain;

public class Item {
	
	private Product product;
	private int quantity;
	
	private final int DEFAULT_QUANTITY=1;
	
	public Item(Product product) {
		super();
		this.quantity=DEFAULT_QUANTITY;
		this.product = product;
	}
	
	public Item(Product product, int quantity) {
		this(product);
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}
