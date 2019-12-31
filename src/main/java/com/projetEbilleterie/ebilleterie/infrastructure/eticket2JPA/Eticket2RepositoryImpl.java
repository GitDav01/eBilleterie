package com.projetEbilleterie.ebilleterie.infrastructure.eticket2JPA;

import com.projetEbilleterie.ebilleterie.domain.eticket2.Eticket2;
import com.projetEbilleterie.ebilleterie.domain.eticket2.Eticket2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Eticket2RepositoryImpl implements Eticket2Repository {

    @Autowired
    private Eticket2DAO eticket2DAO;

    @Override
    public Eticket2 getEticket(String id) {
        return null;
    }

    @Override
    public String saveEticket(Eticket2 newEticket) {
        return null;
    }

    @Override
    public List<Eticket2> findAllEticket() {
        return null;
    }
}
