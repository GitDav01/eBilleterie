package com.projetEbilleterie.ebilleterie.exposition.basket;

import com.projetEbilleterie.ebilleterie.domain.basket.Basket;
import com.projetEbilleterie.ebilleterie.exposition.eticket.EticketAdapter;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class BasketAdapter {

    public BasketAdapter() {}

    static BasketDTO adaptToBasketDTO(Basket basket) {
        return new BasketDTO(
                basket.getId(),
                basket.getQuantity(),
                basket.isStatus(),
                EticketAdapter.adaptToEticketListDTO(basket.getEtickets())
        );
    }

    static Basket transformToBasket(BasketDTO basketDTO) {
        String id = (basketDTO.id == null || basketDTO.id.trim().equals(""))? UUID.randomUUID().toString() : basketDTO.id;
        return new Basket(id,basketDTO.quantity, basketDTO.status,EticketAdapter.transformToEticketList(basketDTO.etickets));
    }

     static List<BasketDTO> adaptToBasketDTOList(List<Basket> baskets) {
        return baskets.stream().map(BasketAdapter::adaptToBasketDTO).collect(Collectors.toList());
    }
}
