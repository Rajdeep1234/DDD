package com.ddd.bank.domain;

import java.util.List;
import java.util.UUID;

public class Customer {

    private UUID id;
    private List<Account> accounts;
    private Address customerAddress;

    public Customer(List<Account> accounts, Address customerAddress) {
        this.id = UUID.randomUUID();
        this.accounts = accounts;
        this.customerAddress = customerAddress;
    }

    public void setCustomerAddress(Address customerAddress) {
        this.customerAddress = customerAddress;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public Address getCustomerAddress() {
        return customerAddress;
    }



}
