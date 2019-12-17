package com.projetEbilleterie.ebilleterie.domain.basket;


public interface BasketRepository {

    String saveBasket(Basket newBasket);
    Basket getBasket(String id);

}
