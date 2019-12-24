package com.projetEbilleterie.ebilleterie.exposition.customer;

import com.projetEbilleterie.ebilleterie.application.CustomerService;

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
    @RequestMapping(method = RequestMethod.POST, path = {"/customers"})
    @ResponseStatus(HttpStatus.CREATED)
    public void createCustomer(@Valid @RequestBody CustomerDTO customerDTO) {
        this.customerService.createCustomer(CustomerAdapter.transformToCustomer(customerDTO));
    }
    @RequestMapping(method = RequestMethod.GET, path = {"/customers/{customerId}"})
    public CustomerDTO detailCustomer(@PathVariable("customerId") String customerId) {
        return CustomerAdapter.adaptToCustomerDTO(this.customerService.obtainCustomer(customerId));
    }
    @RequestMapping(method = RequestMethod.GET, path = {"/customers"})
    public List<CustomerDTO> listAllCustomers() {
        return CustomerAdapter.adaptToCustomerDTOList(this.customerService.listAllCustomer());
    }
}
