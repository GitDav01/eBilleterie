package com.projetEbilleterie.ebilleterie.application;

import com.projetEbilleterie.ebilleterie.domain.customer.Customer;
import com.projetEbilleterie.ebilleterie.domain.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer obtainCustomer(String id) { return this.customerRepository.getCustomer(id); }
    public String createCustomer(Customer newCustomer) { return this.customerRepository.saveCustomer(newCustomer);}
    public List<Customer> listAllCustomer() { return this.customerRepository.findAllCustomer();}
}
