package com.projetEbilleterie.ebilleterie.exposition.basket2;

import com.projetEbilleterie.ebilleterie.application.Basket2Service;
import com.projetEbilleterie.ebilleterie.application.CustomerService;
import com.projetEbilleterie.ebilleterie.domain.basket2.Basket2;

import com.projetEbilleterie.ebilleterie.exposition.customer.CustomerAdapter;
import com.projetEbilleterie.ebilleterie.exposition.customer.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Basket2Resource {

    @Autowired
    Basket2Service basket2Service;


     @CrossOrigin
     @RequestMapping(method = RequestMethod.GET, path = {"/customers/{customerId}/basket2s"})
    public List<CustomerDTO.Basket2DTO> listAllBasket2sFromCustomer(@PathVariable("customerId") Long customerId) {
        List<Basket2> basket2s = this.basket2Service.listAllBasket2s(customerId);
        return CustomerAdapter.adaptToBasket2DTOList(basket2s);
    }

}
