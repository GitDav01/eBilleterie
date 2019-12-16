package com.projetEbilleterie.ebilleterie.infrastructure.customerJPA;

import com.projetEbilleterie.ebilleterie.domain.exception.ErrorCodes;
import com.projetEbilleterie.ebilleterie.domain.exception.MyAppTicketException;
import com.projetEbilleterie.ebilleterie.domain.customer.Customer;
import com.projetEbilleterie.ebilleterie.domain.customer.CustomerRepository;
import com.projetEbilleterie.ebilleterie.infrastructure.customerJPA.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    @Autowired
    private CustomerDAO customerDAO;

    @Override
    public Customer get(String id) {
        return customerDAO.findById(id)
                .map(CustomerJPA::toCustomer)
                .orElseThrow(()
                -> new MyAppTicketException(ErrorCodes.LIBRARY_NOT_FOUND));
    }

    @Override
     public List<Customer> findAll() {
        return customerDAO.findAll()
                .stream()
                .map(CustomerJPA::toCustomer)
                .collect(Collectors.toList());
     }
}
