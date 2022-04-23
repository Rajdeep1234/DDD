package com.ddd.ecom.domain;

import java.util.List;

public class Order {

    private List<Item> items;

    public void chekout(Cart cart) {
        if (isNotChecked(cart))
            cart.checkOut();
        this.items = cart.getItems();
    }

    private boolean isNotChecked(Cart cart) {
        return !cart.isCheckedOut();
    }

}
