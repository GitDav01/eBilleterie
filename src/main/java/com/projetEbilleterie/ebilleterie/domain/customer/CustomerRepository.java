package com.projetEbilleterie.ebilleterie.domain.customer;

import java.util.List;

public interface CustomerRepository {

    Customer getCustomer(String id);
     String saveCustomer(Customer newCustomer);
    List<Customer> findAllCustomer();
}
