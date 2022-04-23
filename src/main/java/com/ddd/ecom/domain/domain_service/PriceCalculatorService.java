package com.ddd.ecom.domain.domain_service;

import java.util.HashMap;
import java.util.Map;

public class PriceCalculatorService {

    private static final Map<String, Double> COMPETITORS_PRICES = new HashMap<>()
    {{
        put("ipadPro", 100d);
        put("heroPen", 200d);
    }};

    public Double getAdjustPrice(String productName) {
        return COMPETITORS_PRICES.get(productName) * 0.9;
    }

}
