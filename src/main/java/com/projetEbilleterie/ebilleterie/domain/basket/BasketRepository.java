package com.projetEbilleterie.ebilleterie.domain.basket;


import java.util.List;

public interface BasketRepository {

    Long saveBasket(Basket newBasket);
    Basket getBasket(Long id);
    List<Basket> findAllBasket();
    Long addBasketQuery(Long customerId, Long eticketId, Basket newBasket);

}
