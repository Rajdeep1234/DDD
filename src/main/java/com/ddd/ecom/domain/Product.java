package com.ddd.ecom.domain;

public class Product {

    private final Price price;
    private String name;
    private Double weightInGram;


    public Product(String name, Price price, Double weightInGram) {
        this.price = price;
        this.name = name;
        this.weightInGram = weightInGram;
    }

    public Price getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Double getWeightInGram() {
        return weightInGram;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }


}
