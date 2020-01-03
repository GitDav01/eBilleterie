package com.projetEbilleterie.ebilleterie.infrastructure.customerJPA;

import com.projetEbilleterie.ebilleterie.domain.customer.Customer;
import com.projetEbilleterie.ebilleterie.infrastructure.providerJPA.ProviderJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerDAO extends JpaRepository<CustomerJPA, Long> {

    @Query("SELECT customer FROM CUSTOMER customer WHERE customer.email = ?1")
    CustomerJPA searchByEmailQuery(String email);
    // JPA se débrouille pour reconstruire la Query avec le mot clé FindByXXX
    CustomerJPA findByEmail(String email);
}
