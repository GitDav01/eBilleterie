package com.projetEbilleterie.ebilleterie.exposition.basket;

import com.projetEbilleterie.ebilleterie.domain.basket.Basket;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BasketAdapter {

    public BasketAdapter() {}

    public static BasketDTO adaptToBasketDTO(Basket basket) {
        return new BasketDTO(
                basket.getId(),
                basket.getQuantity(),
                basket.isStatus()
     //           EticketAdapter.adaptToEticketListDTO(basket.getEtickets())
        );
    }

    public static List<Basket> transformToBasketList(List<BasketDTO> basketDTO) {
        if(basketDTO == null) {return new ArrayList<>(); }
        return basketDTO.stream().map(BasketAdapter::transformToBasket).collect(Collectors.toList());
    }

    static Basket transformToBasket(BasketDTO basketDTO) {
        //String id = (basketDTO.id == null || basketDTO.id.trim().equals(""))? UUID.randomUUID().toString() : basketDTO.id;
        return new Basket(null,basketDTO.quantity, basketDTO.status/*,EticketAdapter.transformToEticketList(basketDTO.etickets)*/);
    }

     public static List<BasketDTO> adaptToBasketDTOList(List<Basket> baskets) {
        return baskets.stream().map(BasketAdapter::adaptToBasketDTO).collect(Collectors.toList());
    }
}
