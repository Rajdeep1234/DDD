package com.thoughtworks.ddd_workshop.application;

import java.util.Currency;
import java.util.List;

import com.thoughtworks.ddd_workshop.domain.Cart;
import com.thoughtworks.ddd_workshop.domain.Item;
import com.thoughtworks.ddd_workshop.domain.Price;
import com.thoughtworks.ddd_workshop.domain.Product;
import com.thoughtworks.ddd_workshop.domainservice.PriceService;

public class Main {

	public static void main(String[] args) {
		
		Cart cart=new Cart();
		
		PriceService priceService=new PriceService();
		
		Product ipadPro=new Product("Ipad Pro",new Price(priceService.getAdjustedProductPrice("Ipad Pro"),Currency.getInstance("INR")));
		  Item ipadProItem=new Item(ipadPro);
		
		Product heroInkPen=new Product("Hero Ink pen",new Price(priceService.getAdjustedProductPrice("Hero Ink pen"),Currency.getInstance("INR")));
		Item heroInkPenItem=new Item(heroInkPen);
		
		Product gmCricketBat=new Product("GM Cricket bat",new Price(priceService.getAdjustedProductPrice("GM Cricket bat"),Currency.getInstance("INR")));
		Item gmCricketBatItem=new Item(gmCricketBat,2);
		
		
		
		cart.addItems(ipadProItem);
		cart.addItems(heroInkPenItem);
		cart.addItems(gmCricketBatItem);
		
		cart.removeItem(ipadPro);
		
		
        List<Item> removedItemList= cart.getRemovedItems();
        
        
       
        
        Cart cart1 =new Cart();
        cart1.addItems(ipadProItem);
        
        Cart cart2 =new Cart();
        cart2.addItems(ipadProItem);
        
        System.out.println(cart1.equals(cart2));
        
        
        
        
	}

}
