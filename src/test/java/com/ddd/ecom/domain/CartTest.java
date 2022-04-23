package com.ddd.ecom.domain;

import com.ddd.ecom.domain.domain_service.PriceCalculatorService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CartTest {


    @Test
    void sameCardShouldReturnTrue() {
        PriceCalculatorService priceCalculatorService = new PriceCalculatorService();
        Cart cart1 = new Cart();

        String ipadProName = "ipadPro";
        String heroPenName = "heroPen";
        Item ipad = new Item(new Product(ipadProName, new Price(priceCalculatorService.getAdjustPrice(ipadProName))));
        Item heroPen = new Item(new Product(heroPenName, new Price(priceCalculatorService.getAdjustPrice(heroPenName))));
        cart1.addItem(ipad);
        cart1.addItem(heroPen);
        Cart cart2 = new Cart();

        cart1.addItem(ipad);
        cart1.addItem(heroPen);

        Assertions.assertThat(cart1.equals(cart2)).isFalse();

        Order order = new Order();
        order.chekout(cart1);
        Assertions.assertThat(cart1.isCheckedOut()).isTrue();

    }
}