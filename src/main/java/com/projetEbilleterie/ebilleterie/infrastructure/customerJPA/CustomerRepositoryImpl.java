package com.projetEbilleterie.ebilleterie.infrastructure.customerJPA;

import com.projetEbilleterie.ebilleterie.domain.customer.Customer;
import com.projetEbilleterie.ebilleterie.domain.customer.CustomerRepository;

import com.projetEbilleterie.ebilleterie.domain.exception.ErrorCodes;
import com.projetEbilleterie.ebilleterie.domain.exception.MyAppTicketException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    @Autowired
    private CustomerDAO customerDAO;


    @Override
    public Customer getCustomer(String id) {
        return customerDAO.findById(id)
                .map(CustomerJPA::toCustomer)
                .orElseThrow(()
                -> new MyAppTicketException(ErrorCodes.CUSTOMER_NOT_FOUND));
    }

    @Override
    public String saveCustomer(Customer customer) {
        CustomerJPA customerJPA = customerDAO.save(new CustomerJPA(customer));
        return customerJPA.getId();
    }

    @Override // inutile dans les uses cases
    public List<Customer> findAllCustomer() {
      return null;
    }
}
