package com.projetEbilleterie.ebilleterie.infrastructure.customerJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerDAO extends JpaRepository<CustomerJPA, Long> {

    @Query("SELECT customer FROM CUSTOMER customer WHERE customer.email = ?1")
    CustomerJPA searchByEmailQuery(String email);
    // JPA se d�brouille pour reconstruire la Query avec le mot cl� FindByXXX
    CustomerJPA findByEmail(String email);
}
