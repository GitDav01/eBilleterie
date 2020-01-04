package com.projetEbilleterie.ebilleterie.infrastructure.basketJPA;

import com.projetEbilleterie.ebilleterie.domain.basket.Basket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

interface BasketDAO extends JpaRepository<BasketJPA, Long> {
 //   @Query("INSERT INTO BASKET (id,quantity, status customerId, eticketId) VALUES(?, ?, ?, ?,?)")
  //  Long addBasketQuery(Long id, int quantity, boolean status,Long customerId, Long eticketId);
}
