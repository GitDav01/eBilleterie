package com.projetEbilleterie.ebilleterie.application;

import com.projetEbilleterie.ebilleterie.domain.basket.Basket;
import com.projetEbilleterie.ebilleterie.domain.basket.BasketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class BasketService {

    @Autowired
    private BasketRepository basketRepository;

    public Basket obtainBasket(Long id) {return this.basketRepository.getBasket(id); }
    public Long createBasket(Basket newBasket) {
        return this.basketRepository.saveBasket(newBasket);
    }
    public List<Basket> listAllBasket() { return this.basketRepository.findAllBasket();}

}
