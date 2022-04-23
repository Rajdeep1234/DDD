package com.thoughtworks.ddd_workshop.service;

import java.util.HashMap;
import java.util.Map;

public class PriceService {
	
	
	private static Map<String, Double> competitorPriceMap=new HashMap<>(){{
	     put("Ipad Pro", Double.valueOf(100.0));
	     put("Hero Ink pen", Double.valueOf(100.0));
	     put("GM Cricket bat", Double.valueOf(100.0));
	}};
	
	
	
	public double getAdjustedProductPrice(String productName) {
		double price=competitorPriceMap.get(productName);
		return price*0.9;
	}

}
