package com.ddd.ecom.domain;

import java.util.*;

public class Cart {

    private UUID uuid;
    private List<Item> items = new ArrayList<>();
    private List<Item> removedItems = new ArrayList<>();
    private boolean checkedOut = true;

    public Cart() {
        this.uuid = UUID.randomUUID();
    }
    public void addItem(Item item) {
        items.add(item);
    }

    public void remove(String productName) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getProduct().getName().equals(productName)) {
                removedItems.add(items.get(i));
                items.remove(i);
                break;
            }
        }
    }

    public void createOrder() {

    }

    public void checkOut() {
        this.checkedOut = false;
    }

    public List<Item> getRemovedItems() {
        return removedItems;
    }

    public void reset(Cart cart) {
        cart = null;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public List<Item> getItems() {
        return items;
    }
}
