package com.projetEbilleterie.ebilleterie.exposition.customer;

import com.projetEbilleterie.ebilleterie.domain.customer.Customer;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class CustomerAdapter {

    public CustomerAdapter() {}

    static CustomerDTO adaptToCustomerDTO(Customer customer) {
        return new CustomerDTO(
                customer.getId(),
                customer.getLastname(),
                customer.getFirstname(),
                customer.getProfil(),
                customer.getLink(),
                customer.getBasket(),
                customer.getRelatives()
        );
    }
    static Customer transformToCustomer(CustomerDTO customerDTO) {
        String id = (customerDTO.id == null || customerDTO.id.trim().equals(""))? UUID.randomUUID().toString() : customerDTO.id;
        return null;
    }

    static List<CustomerDTO> adaptToCustomerDTOList(List<Customer> customers) {
        return customers.stream().map(CustomerAdapter::adaptToCustomerDTO).collect(Collectors.toList());
    }
}
