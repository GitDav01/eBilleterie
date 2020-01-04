package com.projetEbilleterie.ebilleterie.infrastructure.basket2JPA;

import com.projetEbilleterie.ebilleterie.infrastructure.RelativeJPA.RelativeJPA;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Basket2DAO extends JpaRepository<Basket2JPA, Long> {
}
