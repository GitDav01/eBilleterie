package com.projetEbilleterie.ebilleterie.domain.basket;


import java.util.List;

public interface BasketRepository {

    String saveBasket(Basket newBasket);
    Basket getBasket(String id);
    List<Basket> findAllBasket();

}
