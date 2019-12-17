package com.projetEbilleterie.ebilleterie.application;

import com.projetEbilleterie.ebilleterie.domain.basket.Basket;
import com.projetEbilleterie.ebilleterie.domain.basket.BasketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class BasketService {

    @Autowired
    private BasketRepository basketRepository;

    public Basket obtainBasket(String id) {
        return this.basketRepository.getBasket(id);
    }
    public String createBasket(Basket newBasket) {
        return this.basketRepository.saveBasket(newBasket);
    }
}
