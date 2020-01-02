package com.projetEbilleterie.ebilleterie.domain.customer;

import java.util.List;

public interface CustomerRepository {

    Customer getCustomer(Long id);
    Customer searchByEmailQuery(String email);
    Long saveCustomer(Customer newCustomer);
    List<Customer> findAllCustomer();


}
