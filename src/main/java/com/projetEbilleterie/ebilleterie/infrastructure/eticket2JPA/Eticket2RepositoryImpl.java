package com.projetEbilleterie.ebilleterie.infrastructure.eticket2JPA;

import com.projetEbilleterie.ebilleterie.domain.eticket2.Eticket2;
import com.projetEbilleterie.ebilleterie.domain.eticket2.Eticket2Repository;
import com.projetEbilleterie.ebilleterie.domain.exception.ErrorCodes;
import com.projetEbilleterie.ebilleterie.domain.exception.MyAppTicketException;
import com.projetEbilleterie.ebilleterie.infrastructure.eticketJPA.EticketJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class Eticket2RepositoryImpl implements Eticket2Repository {

    @Autowired
    private Eticket2DAO eticket2DAO;

    @Override
    public Eticket2 getEticket(String id) {
        return eticket2DAO.findById(id)
                .map(Eticket2JPA::toEticket2)
                .orElseThrow(()
                        -> new MyAppTicketException(ErrorCodes.ETICKET_NOT_FOUND));
    }

    @Override
    public String saveEticket(Eticket2 newEticket) {
        return null;
    }

    @Override
    public List<Eticket2> findAllEticket() {

        return eticket2DAO.findAll()
                .stream()
                .map(Eticket2JPA::toEticket2)
                .collect(Collectors.toList());
    }
}
