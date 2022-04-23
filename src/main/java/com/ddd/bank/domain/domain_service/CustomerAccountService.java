package com.ddd.bank.domain.domain_service;

import com.ddd.bank.domain.Address;
import com.ddd.bank.domain.Customer;

public class CustomerAccountService {

    public void updateAddress(Customer customer, Address address) {
        customer.setCustomerAddress(address);
        customer.getAccounts()
                .forEach(account -> account.setAddress(address));
    }

}
