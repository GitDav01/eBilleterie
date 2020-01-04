package com.projetEbilleterie.ebilleterie.exposition.customer;

import com.projetEbilleterie.ebilleterie.application.CustomerService;

import com.projetEbilleterie.ebilleterie.exposition.basket2.Basket2Adapter;
import com.projetEbilleterie.ebilleterie.exposition.basket2.Basket2DTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CustomerResource {

    @Autowired
    private CustomerService customerService;

    @CrossOrigin

    // recherche customer par email
    @RequestMapping(method = RequestMethod.GET, path = {"/customers/customer/email/{email}"})
    public CustomerDTO searchByEmailQuery(@PathVariable("email") String email) {
        return CustomerAdapter.adaptToCustomerDTO(this.customerService.searchByEmailQuery(email));
    }

    // recherche customer par ID
    @RequestMapping(method = RequestMethod.GET, path = {"/customers/{customerId}"})
    public CustomerDTO detailCustomer(@PathVariable("customerId") Long customerId) {
        return CustomerAdapter.adaptToCustomerDTO(this.customerService.obtainCustomer(customerId));
    }

    // Récupère la liste de tous les customers
    @RequestMapping(method = RequestMethod.GET, path = {"/customers"})
    public List<CustomerDTO> listAllCustomers() {
        return CustomerAdapter.adaptToCustomerDTOList(this.customerService.listAllCustomer());
    }


    @RequestMapping(method = RequestMethod.POST, path = {"/customers/{customerId}/basket2"})
    @ResponseStatus(HttpStatus.CREATED)
    public void addBasket2ToCustomer(@PathVariable("customerId") Long customerId, @RequestBody Basket2DTO basket2DTO) {
        this.customerService.addBasket2(customerId, Basket2Adapter.transformToBasket2(basket2DTO));
    }

    @RequestMapping(method = RequestMethod.DELETE, path = {"/customers/{customerId}/basket2s/{basket2Id}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeBasket2FromCustomer(@PathVariable("customerId") Long customerId, @PathVariable("basket2Id") Long basket2Id) {
        this.customerService.removeBasket2(customerId, basket2Id);
    }

    @RequestMapping(method = RequestMethod.PUT, path = {"/customers/{customerId}/basket2s/{basket2Id}"})
    public void updateBasket2(@PathVariable("customerId") Long customerId, @PathVariable("basket2Id") Long basket2Id, @RequestBody Basket2DTO basket2DTO) {
        this.customerService.updateBasket2(customerId, basket2Id, Basket2Adapter.transformToBasket2(basket2DTO));
    }

}
