package com.projetEbilleterie.ebilleterie.domain.customer;

import com.projetEbilleterie.ebilleterie.domain.customer.Customer;

import java.util.List;

public interface CustomerRepository {

    Customer get(String id);
    List<Customer> findAll();
}
