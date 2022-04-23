package com.ddd.bank.domain.domain_service;

import com.ddd.bank.domain.Account;
import com.ddd.bank.domain.Address;
import com.ddd.bank.domain.Customer;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CustomerTest {

    @Test
    void shouldUpdateAddteAddress() {
        Address address = new Address("Chennai");
        List<Account> accounts = List.of(
                new Account(address),
                new Account(address),
                new Account(address)
        );

        Customer customer = new Customer(accounts, address);
        Address newAddress = new Address("Kolkata");
        customer.updateAddress(customer, newAddress);
        Assertions.assertThat(customer.getCustomerAddress().getCity()).isEqualTo(newAddress.getCity());
        Assertions.assertThat(customer.getAccounts().get(1).getAddress().getCity()).isEqualTo(newAddress.getCity());

    }
}
