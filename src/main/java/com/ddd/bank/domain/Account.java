package com.ddd.bank.domain;

import java.util.UUID;

public class Account {

    private UUID accountId;
    private Address address;

    public Account(Address address) {
        accountId = UUID.randomUUID();
        this.address = address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
