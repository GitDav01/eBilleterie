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
}
