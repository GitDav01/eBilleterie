package com.projetEbilleterie.ebilleterie.exposition.customer;

import com.projetEbilleterie.ebilleterie.domain.customer.Customer;
import com.projetEbilleterie.ebilleterie.exposition.basket.BasketAdapter;
import com.projetEbilleterie.ebilleterie.exposition.basket2.Basket2Adapter;
import com.projetEbilleterie.ebilleterie.exposition.relative.RelativeAdapter;

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
                customer.getEmail(),
                customer.getPhoneNumber(),
                customer.getAdress(),
                RelativeAdapter.adaptToRelativeDTOList(customer.getRelatives()),
                customer.getPassword(),
                Basket2Adapter.adaptToBasket2DTOList(customer.getBasket2s())
               );
    }
    static Customer transformToCustomer(CustomerDTO customerDTO) {
        return new Customer(customerDTO.id,customerDTO.lastname, customerDTO.firstname,
                customerDTO.profil, customerDTO.email, customerDTO.phoneNumber, customerDTO.adress,
                RelativeAdapter.transformToRelativeList(customerDTO.relatives),customerDTO.password,
                Basket2Adapter.transformToBasket2List(customerDTO.basket2s));
    }

    static List<CustomerDTO> adaptToCustomerDTOList(List<Customer> customers) {
        return customers.stream().map(CustomerAdapter::adaptToCustomerDTO).collect(Collectors.toList());
    }
}
