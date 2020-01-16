package com.projetEbilleterie.ebilleterie.exposition.eticket2;

import com.projetEbilleterie.ebilleterie.domain.eticket2.Eticket2;
import com.projetEbilleterie.ebilleterie.domain.rate.Rate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Eticket2Adapter {

    public static List<Eticket2DTO> adaptToEticket2DTOList(List<Eticket2> etickets) {
        return etickets.stream().map(Eticket2Adapter::adaptToEticketDTO).collect(Collectors.toList());
    }

    public static Eticket2DTO adaptToEticketDTO(Eticket2 eticket) {
        return new Eticket2DTO(
                eticket.getId(),
                eticket.getCategory(),
                eticket.getReference(),
                eticket.getDescription(),
                eticket.getLaw(),
                eticket.isNominative(),
                eticket.getValidityDate(),
                adaptToRateDTOList(eticket.getRates()),
                eticket.getImage(),
                eticket.getProvider()
              );
    }

    public static List<Eticket2> transformToEticketList(List<Eticket2DTO> eticketDTO) {
        if(eticketDTO == null) {return new ArrayList<>();}
        return eticketDTO.stream().map(Eticket2Adapter::transformToEticket).collect(Collectors.toList());
    }

    public static Eticket2 transformToEticket(Eticket2DTO eTicketDTO) {
        return new Eticket2(null, eTicketDTO.category,eTicketDTO.reference, eTicketDTO.description,eTicketDTO.law,eTicketDTO.nominative,
                eTicketDTO.validityDate, transformToRateList(eTicketDTO.rates),
                eTicketDTO.image,eTicketDTO.provider);
    }
    static List<Eticket2DTO> adaptToEticketDTOList(List<Eticket2> etickets) {
        return etickets.stream().map(Eticket2Adapter::adaptToEticketDTO).collect(Collectors.toList());
    }

    // Adapter DTO Rate
    //-----------------

    public static Eticket2DTO.RateDTO adaptToRateDTO(Rate rate) {
        return new Eticket2DTO.RateDTO(
                rate.getName(),
                rate.getPrice(),
                rate.getQuantity(),
                rate.getTypePrice()
        );
    }

    public static List<Rate> transformToRateList(List<Eticket2DTO.RateDTO> rateDTO) {
        if(rateDTO == null) {
            return new ArrayList<>();
        }
        return rateDTO.stream().map(Eticket2Adapter::transformToRate).collect(Collectors.toList());
    }
    public static List<Eticket2DTO.RateDTO> adaptToRateDTOList(List<Rate> rates) {
        return rates.stream().map(Eticket2Adapter::adaptToRateDTO).collect(Collectors.toList());
    }

    static Rate transformToRate(Eticket2DTO.RateDTO rateDTO) {
        return new Rate(null,rateDTO.name,rateDTO.price,rateDTO.quantity,rateDTO.typePrice);
    }

}
