package com.projetEbilleterie.ebilleterie.infrastructure.OrderJPA;

import com.projetEbilleterie.ebilleterie.infrastructure.OrderJPA.OrderJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderDAO extends JpaRepository<OrderJPA, Long> {
/*
    @Query("SELECT provider FROM PROVIDER provider WHERE provider.name = ?1")
    OrderJPA searchByNameQuery(String name);
    // JPA se d�brouille pour reconstruire la Query avec le mot cl� FindByXXX
    OrderJPA findByName(String name);
    */
}
