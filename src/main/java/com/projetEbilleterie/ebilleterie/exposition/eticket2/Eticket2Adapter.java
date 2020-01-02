package com.projetEbilleterie.ebilleterie.exposition.eticket2;

import com.projetEbilleterie.ebilleterie.domain.eticket2.Eticket2;
import com.projetEbilleterie.ebilleterie.exposition.rate.RateAdapter;

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
                RateAdapter.adaptToRateDTOList(eticket.getRates()),
                eticket.getImage(),
                eticket.getProvider()
        );
    }

    public static List<Eticket2> transformToEticketList(List<Eticket2DTO> eticketDTO) {
        if(eticketDTO == null) {return new ArrayList<>();}
        return eticketDTO.stream().map(Eticket2Adapter::transformToEticket).collect(Collectors.toList());
    }

    public static Eticket2 transformToEticket(Eticket2DTO eTicketDTO) {
       // String id = (eTicketDTO.id == null || eTicketDTO.id.trim().equals(""))? UUID.randomUUID().toString() : eTicketDTO.id;
        return new Eticket2(null, eTicketDTO.category,eTicketDTO.reference, eTicketDTO.description,eTicketDTO.law,eTicketDTO.nominative,
                eTicketDTO.validityDate, RateAdapter.transformToRateList(eTicketDTO.rates),
                eTicketDTO.image,eTicketDTO.provider);
    }
    static List<Eticket2DTO> adaptToEticketDTOList(List<Eticket2> etickets) {
        return etickets.stream().map(Eticket2Adapter::adaptToEticketDTO).collect(Collectors.toList());
    }
}
