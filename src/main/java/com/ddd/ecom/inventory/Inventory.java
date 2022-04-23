package com.ddd.ecom.inventory;

public enum Inventory {
    HERO_PEN("HeroInkPen"),
    IPAD_PRO("iPadPro"),
    GM_CRICKET_BAT("Gm cricket bat");

    Inventory(String name) {
        this.name = name;
    }

    private String name;
}
