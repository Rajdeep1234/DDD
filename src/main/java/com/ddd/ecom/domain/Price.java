package com.ddd.ecom.domain;

import java.util.Currency;

import static java.util.Locale.US;

public final class Price {

    private static final Currency DEFAULT_CURRENCY = Currency.getInstance(US);

    private Double amount;
    private Currency currency;

    public Price(Double amount) {
        this.amount = amount;
        this.currency = DEFAULT_CURRENCY;
    }
}
