package com.projetEbilleterie.ebilleterie.exposition.eticket;

import com.projetEbilleterie.ebilleterie.domain.customer.Customer;
import com.projetEbilleterie.ebilleterie.domain.eticket.Eticket;
import com.projetEbilleterie.ebilleterie.exposition.customer.CustomerAdapter;
import com.projetEbilleterie.ebilleterie.exposition.customer.CustomerDTO;
import com.projetEbilleterie.ebilleterie.exposition.provider.ProviderAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EticketAdapter {

    private EticketAdapter(){}

    public static List<EticketDTO> adaptToEticketListDTO(List<Eticket> etickets) {
        return etickets.stream().map(EticketAdapter::adaptToEticketDTO).collect(Collectors.toList());
    }

    public static EticketDTO adaptToEticketDTO(Eticket eticket) {
        return new EticketDTO(
                eticket.getId(),
                eticket.getCategory(),
                eticket.getReference(),
                eticket.getDescription(),
                eticket.getLaw(),
                eticket.isNominative(),
                eticket.getValidityDate(),
                eticket.getTypePrice(),
                eticket.getPrice(),
                eticket.getStock(),
                eticket.getImage(),
                eticket.getProvider()
        );
    }

    public static List<Eticket> transformToEticketList(List<EticketDTO> eticketDTO) {
        if(eticketDTO == null) {
            return new ArrayList<>();
        }
        return eticketDTO.stream().map(EticketAdapter::transformToEticket).collect(Collectors.toList());
    }

    public static Eticket transformToEticket(EticketDTO eTicketDTO) {
        return new Eticket(null, eTicketDTO.category,eTicketDTO.reference, eTicketDTO.description,eTicketDTO.law,eTicketDTO.nominative,
                eTicketDTO.validityDate,eTicketDTO.typePrice,eTicketDTO.price,
                eTicketDTO.stock,eTicketDTO.image,eTicketDTO.provider);
    }
    static List<EticketDTO> adaptToEticketDTOList(List<Eticket> etickets) {
        return etickets.stream().map(EticketAdapter::adaptToEticketDTO).collect(Collectors.toList());
    }

}
