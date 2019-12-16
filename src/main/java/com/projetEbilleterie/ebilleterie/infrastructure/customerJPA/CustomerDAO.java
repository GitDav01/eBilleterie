package com.projetEbilleterie.ebilleterie.infrastructure.customerJPA;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDAO extends JpaRepository<CustomerJPA, String> {
}


