package com.ddd.ecom.domain;

public class Item {

    private static final Integer DEFAULT_QUANTITY = 1;

    private Product product;
    private Integer quantity = DEFAULT_QUANTITY;

    public Item(Product item) {
        this.product = item;
    }

    public Item(Product item, Integer quantity) {
        this.product = item;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }

}
