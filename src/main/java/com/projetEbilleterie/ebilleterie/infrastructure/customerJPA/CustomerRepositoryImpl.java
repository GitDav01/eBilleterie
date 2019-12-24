package com.projetEbilleterie.ebilleterie.infrastructure.customerJPA;

import com.projetEbilleterie.ebilleterie.domain.customer.Customer;
import com.projetEbilleterie.ebilleterie.domain.customer.CustomerRepository;

import com.projetEbilleterie.ebilleterie.domain.exception.ErrorCodes;
import com.projetEbilleterie.ebilleterie.domain.exception.MyAppTicketException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    @Autowired
    private CustomerDAO customerDAO;


    @Override
    public Customer getCustomer(String id) {
    return null;
    }

    @Override
    public String saveCustomer(Customer customer) {
      return null;
    }

    @Override
    public List<Customer> findAllCustomer() {
        return null;
    }
}
