package com.projetEbilleterie.ebilleterie.exposition.rate;

import com.projetEbilleterie.ebilleterie.domain.rate.Rate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class RateAdapter {

    static RateDTO adaptToRateDTO(Rate rate) {
        return new RateDTO(
                //   rate.getId(),
                rate.getName(),
                rate.getPrice(),
                rate.getQuantity(),
                rate.getTypePrice()
        );
    }

    public static List<RateDTO> adaptToRateDTOList(List<Rate> rates) {
        return rates.stream().map(RateAdapter::adaptToRateDTO).collect(Collectors.toList());
    }

    public static List<Rate> transformToRateList(List<RateDTO> rateDTO) {
        if(rateDTO == null) {
            return new ArrayList<>();
        }
        return rateDTO.stream().map(RateAdapter::transformToRate).collect(Collectors.toList());
    }

    static Rate transformToRate(RateDTO rateDTO) {
        //  String id = (relativeDTO.id == null || relativeDTO.id.trim().equals(""))? UUID.randomUUID().toString() : relativeDTO.id;
        return new Rate(null,rateDTO.name,rateDTO.price,rateDTO.quantity,rateDTO.typePrice);
    }
}
