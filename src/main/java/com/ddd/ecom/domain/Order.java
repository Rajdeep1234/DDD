package com.ddd.ecom.domain;

import java.util.List;

public class Order {

    private List<Item> items;
    private Double totalCost = 0d;

    public void chekout(Cart cart) {
        if (isNotChecked(cart))
            cart.checkOut();
        this.items = cart.getItems();
    }

    private boolean isNotChecked(Cart cart) {
        return !cart.isCheckedOut();
    }
    //Problem #11 - Calculate Total cost for the Order.  Put shipping cost as per weight
    //Total cost = cost of all products in order + (weightIngrams of each product *.01)


    public Double getTotalCost() {
        calculateTotalAmountWithShippingCharge();
        return this.totalCost;
    }

    private void calculateTotalAmountWithShippingCharge() {
        for (Item item : this.items) {
            Product product = item.getProduct();
            totalCost = totalCost + (product.getPrice().getAmount() * item.getQuantity()) + (product.getWeightInGram() * .01);
            totalCost = (double) Math.round(totalCost);
        }
    }
}
