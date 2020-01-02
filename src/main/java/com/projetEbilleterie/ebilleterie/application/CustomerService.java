package com.projetEbilleterie.ebilleterie.application;

import com.projetEbilleterie.ebilleterie.domain.customer.Customer;
import com.projetEbilleterie.ebilleterie.domain.customer.CustomerRepository;
import com.projetEbilleterie.ebilleterie.domain.relative.Relative;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Transactional
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer obtainCustomer(String id) { return this.customerRepository.getCustomer(id); }
    public String createCustomer(Customer newCustomer) { return this.customerRepository.saveCustomer(newCustomer);}
    public List<Customer> listAllCustomer() { return this.customerRepository.findAllCustomer();}

    // Methodes liées aux Relatives construites avec les fonctions primales supérieures
    public List<Relative> listAllRelatives(String customerId) {
        Customer customer = obtainCustomer(customerId);
        return Collections.unmodifiableList(customer.getRelatives());
    }
    public void addRelative(String customerId, Relative relative) {
        Customer customer = obtainCustomer(customerId);
        customer.addRelative(relative);
      //  String retour = createCustomer(customer);
        this.customerRepository.saveCustomer(customer);
    }
    public void removeRelative(String customerId, String relativeId) {
        Customer customer = obtainCustomer(customerId);
        customer.removeRelative(relativeId);
        this.customerRepository.saveCustomer(customer);
    }

    public void updateRelative(String customerId, String relativeId, Relative relative) {
        Customer customer = obtainCustomer(customerId);
        customer.updateRelative(relativeId, relative);
        this.customerRepository.saveCustomer(customer);
    }

}
