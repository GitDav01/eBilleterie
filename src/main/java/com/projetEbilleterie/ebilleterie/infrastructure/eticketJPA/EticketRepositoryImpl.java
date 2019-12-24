package com.projetEbilleterie.ebilleterie.infrastructure.eticketJPA;

import com.projetEbilleterie.ebilleterie.domain.eticket.Eticket;
import com.projetEbilleterie.ebilleterie.domain.eticket.EticketRepository;
import com.projetEbilleterie.ebilleterie.domain.exception.ErrorCodes;
import com.projetEbilleterie.ebilleterie.domain.exception.MyAppTicketException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class EticketRepositoryImpl implements EticketRepository {

    @Autowired
    private EticketDAO eticketDAO;

    @Override
    public Eticket getEticket(String id) {
        return eticketDAO.findById(id)
                .map(EticketJPA::toEticket)
                .orElseThrow(()
                        -> new MyAppTicketException(ErrorCodes.ETICKET_NOT_FOUND));
    }

    @Override
    public String saveEticket(Eticket eticket) {
        EticketJPA eticketJPA = eticketDAO.save(new EticketJPA(eticket));
        return eticketJPA.getId();
    }

    @Override
    public List<Eticket> findAllEticket() {
        return eticketDAO.findAll()
                .stream()
                .map(EticketJPA::toEticket)
                .collect(Collectors.toList());
    }
}
