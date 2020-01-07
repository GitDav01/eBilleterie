package com.projetEbilleterie.ebilleterie.application;

import com.projetEbilleterie.ebilleterie.domain.basket.Basket;
import com.projetEbilleterie.ebilleterie.domain.basket.BasketRepository;
import com.projetEbilleterie.ebilleterie.domain.basket2.Basket2;
import com.projetEbilleterie.ebilleterie.domain.basket2.Basket2Repository;
import com.projetEbilleterie.ebilleterie.domain.customer.Customer;
import com.projetEbilleterie.ebilleterie.domain.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Transactional
@Service
public class Basket2Service {

    @Autowired
    private Basket2Repository basket2Repository;
    @Autowired
    private CustomerService customerService;


    public List<Basket2> listAllBasket2s(Long customerId) {
        Customer customer = customerService.obtainCustomer(customerId);
        return Collections.unmodifiableList(customer.getBasket2s());
    }

}
