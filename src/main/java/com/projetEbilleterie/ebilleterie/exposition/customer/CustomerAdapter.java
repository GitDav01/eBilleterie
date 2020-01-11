package com.projetEbilleterie.ebilleterie.exposition.customer;

import com.projetEbilleterie.ebilleterie.domain.basket2.Basket2;
import com.projetEbilleterie.ebilleterie.domain.customer.Customer;
import com.projetEbilleterie.ebilleterie.domain.relative.Relative;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerAdapter {

    public CustomerAdapter() {}

    // Adapter DTO Customer
    //-----------------
    static CustomerDTO adaptToCustomerDTO(Customer customer) {
        return new CustomerDTO(
                customer.getId(),
                customer.getLastname(),
                customer.getFirstname(),
                customer.getProfil(),
                customer.getEmail(),
                customer.getPhoneNumber(),
                customer.getAdress(),
                CustomerAdapter.adaptToRelativeDTOList(customer.getRelatives()),
                customer.getPassword(),
                CustomerAdapter.adaptToBasket2DTOList(customer.getBasket2s())
               );
    }
    static Customer transformToCustomer(CustomerDTO customerDTO) {
        return new Customer(customerDTO.id,customerDTO.lastname, customerDTO.firstname,
                customerDTO.profil, customerDTO.email, customerDTO.phoneNumber, customerDTO.adress,
                CustomerAdapter.transformToRelativeList(customerDTO.relatives),customerDTO.password,
                CustomerAdapter.transformToBasket2List(customerDTO.basket2s));
    }

    static List<CustomerDTO> adaptToCustomerDTOList(List<Customer> customers) {
        return customers.stream().map(CustomerAdapter::adaptToCustomerDTO).collect(Collectors.toList());
    }

    // Adapter DTO Relative
    //-----------------
    public static CustomerDTO.RelativeDTO adaptToRelativeDTO(Relative relative) {
        return new CustomerDTO.RelativeDTO(
                //   relative.getId(),
                relative.getLastname(),
                relative.getFirstname(),
                relative.getEmail(),
                relative.getPhoneNumber()
        );
    }

    public static List<Relative> transformToRelativeList(List<CustomerDTO.RelativeDTO> relativeDTO) {
        if(relativeDTO == null) {return new ArrayList<>();}
        return relativeDTO.stream().map(CustomerAdapter::transformToRelative).collect(Collectors.toList());
    }

    public static List<CustomerDTO.RelativeDTO> adaptToRelativeDTOList(List<Relative> relatives) {
        return relatives.stream().map(CustomerAdapter::adaptToRelativeDTO).collect(Collectors.toList());
    }

    public static Relative transformToRelative(CustomerDTO.RelativeDTO relativeDTO) {
        return new Relative(null,relativeDTO.lastname,relativeDTO.firstname,relativeDTO.email,relativeDTO.phoneNumber);
    }

    // Adapter DTO Basket
    //-------------------
    public static CustomerDTO.Basket2DTO adaptToBasket2DTO(Basket2 basket2) {
        return new CustomerDTO.Basket2DTO(
                //   relative.getId(),
                basket2.getQuantity(),
                basket2.isStatus(),
                basket2.getCategory(),
                basket2.getReference(),
                basket2.getPrice(),
                basket2.getTypePrice(),
                basket2.getPurchaseDate(),
                basket2.getRelativeName()
        );
    }

    public static List<Basket2> transformToBasket2List(List<CustomerDTO.Basket2DTO> basket2DTO) {
        if(basket2DTO == null) {return new ArrayList<>();}
        return basket2DTO.stream().map(CustomerAdapter::transformToBasket2).collect(Collectors.toList());
    }

    public static List<CustomerDTO.Basket2DTO> adaptToBasket2DTOList(List<Basket2> basket2s) {
        return basket2s.stream().map(CustomerAdapter::adaptToBasket2DTO).collect(Collectors.toList());
    }

    public static Basket2 transformToBasket2(CustomerDTO.Basket2DTO basket2DTO) {
        return new Basket2(null,basket2DTO.quantity,basket2DTO.status,basket2DTO.category,basket2DTO.reference,
                basket2DTO.price,basket2DTO.typePrice,basket2DTO.purchaseDate,basket2DTO.relativeName);
    }

}
