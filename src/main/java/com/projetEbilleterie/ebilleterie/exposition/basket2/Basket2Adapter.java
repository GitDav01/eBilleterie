package com.projetEbilleterie.ebilleterie.exposition.basket2;

import com.projetEbilleterie.ebilleterie.domain.basket2.Basket2;
import com.projetEbilleterie.ebilleterie.domain.relative.Relative;
import com.projetEbilleterie.ebilleterie.exposition.relative.RelativeDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class Basket2Adapter {


    public static Basket2DTO adaptToBasket2DTO(Basket2 basket2) {
        return new Basket2DTO(
             //   relative.getId(),
                basket2.getQuantity(),
                basket2.isStatus(),
                basket2.getCategory(),
                basket2.getReference(),
                basket2.getPrice(),
                basket2.getTypePrice(),
                basket2.getPurchaseDate()
         );
    }

    public static List<Basket2> transformToBasket2List(List<Basket2DTO> basket2DTO) {
        if(basket2DTO == null) {return new ArrayList<>();}
        return basket2DTO.stream().map(Basket2Adapter::transformToBasket2).collect(Collectors.toList());
    }

    public static List<Basket2DTO> adaptToBasket2DTOList(List<Basket2> basket2s) {
        return basket2s.stream().map(Basket2Adapter::adaptToBasket2DTO).collect(Collectors.toList());
    }

    public static Basket2 transformToBasket2(Basket2DTO basket2DTO) {
        return new Basket2(null,basket2DTO.quantity,basket2DTO.status,basket2DTO.category,basket2DTO.reference,
                basket2DTO.price,basket2DTO.typePrice,basket2DTO.purchaseDate);
    }
}
