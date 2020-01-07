package com.projetEbilleterie.ebilleterie.application;

import com.projetEbilleterie.ebilleterie.domain.basket2.Basket2;
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

    @Autowired
    private Eticket2Service eticket2Service;

    public Customer obtainCustomer(Long id) { return this.customerRepository.getCustomer(id); }
    public Customer searchByEmailQuery(String email) { return this.customerRepository.searchByEmailQuery(email); }
    public List<Customer> listAllCustomer() { return this.customerRepository.findAllCustomer();}

    // Methodes liées aux Relatives construites avec les fonctions primales supérieures
    //----------------------------------------------------------------------------------
    public List<Relative> listAllRelatives(Long customerId) {
        Customer customer = obtainCustomer(customerId);
        return Collections.unmodifiableList(customer.getRelatives());
    }
    public void addRelative(Long customerId, Relative relative) {
        Customer customer = obtainCustomer(customerId);
        customer.addRelative(relative);
        this.customerRepository.saveCustomer(customer);
    }
    public void removeRelative(Long customerId, Long relativeId) {
        Customer customer = obtainCustomer(customerId);
        customer.removeRelative(relativeId);
        this.customerRepository.saveCustomer(customer);
    }

    public void updateRelative(Long customerId, Long relativeId, Relative relative) {
        Customer customer = obtainCustomer(customerId);
        customer.updateRelative(relativeId, relative);
        this.customerRepository.saveCustomer(customer);
    }

    // Methodes liées ux baskets
    //--------------------------

    public List<Basket2> listAllBasket2s(Long customerId) {
        Customer customer = obtainCustomer(customerId);
        return Collections.unmodifiableList(customer.getBasket2s());
    }
    public void addBasket2(Long customerId, Basket2 basket2) {
        Customer customer = obtainCustomer(customerId);
        customer.addBasket2(basket2);
        this.customerRepository.saveCustomer(customer);
    }

    public void removeBasket2(Long customerId, Long basket2Id) {
        Customer customer = obtainCustomer(customerId);
        customer.removeBasket2(basket2Id);
        this.customerRepository.saveCustomer(customer);
    }

    public void updateBasket2(Long customerId, Long basket2Id, Basket2 basket2) {
        Customer customer = obtainCustomer(customerId);
        customer.updateBasket2(basket2Id, basket2);
        this.customerRepository.saveCustomer(customer);
    }

 }
