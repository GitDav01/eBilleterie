package com.projetEbilleterie.ebilleterie.infrastructure.basketJPA;

import com.projetEbilleterie.ebilleterie.domain.basket.Basket;
import com.projetEbilleterie.ebilleterie.domain.basket.BasketRepository;
import com.projetEbilleterie.ebilleterie.domain.exception.ErrorCodes;
import com.projetEbilleterie.ebilleterie.domain.exception.MyAppTicketException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BasketRepositoryImpl implements BasketRepository {

    @Autowired
    private BasketDAO basketDAO;

    @Override
    public String saveBasket(Basket basket) {
       BasketJPA basketJPA = basketDAO.save(new BasketJPA(basket));
        return basketJPA.getId();
    }

    @Override
    public Basket getBasket(String id) {
        return basketDAO.findById(id)
                .map(BasketJPA::toBasket)
                .orElseThrow(()
                -> new MyAppTicketException(ErrorCodes.BASKET_NOT_FOUND));
    }

    @Override
    public List<Basket> findAllBasket() {
        return basketDAO.findAll()
                .stream()
                .map(BasketJPA::toBasket)
                .collect(Collectors.toList());
    }
}
