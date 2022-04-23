package com.thoughtworks.ddd_workshop.domain;

import java.util.Currency;

public class Price {
	private double price;
	private Currency cur;
	
	public double getPrice() {
		return price;
	}
	
	
	public Currency getCur() {
		return cur;
	}
	
	
	public Price(double price, Currency cur) {
		super();
		this.price = price;
		this.cur = cur;
	}
	
	

}
