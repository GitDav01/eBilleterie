package com.projetEbilleterie.ebilleterie.application;


import com.projetEbilleterie.ebilleterie.domain.eticket2.Eticket2;
import com.projetEbilleterie.ebilleterie.domain.eticket2.Eticket2Repository;
import com.projetEbilleterie.ebilleterie.domain.rate.Rate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Transactional
@Service
public class Eticket2Service {

    @Autowired
    private Eticket2Repository eticket2Repository;

    public Eticket2 obtainEticket(Long id) {return this.eticket2Repository.getEticket(id); }
    public Long createEticket(Eticket2 newEticket) {
        return this.eticket2Repository.saveEticket(newEticket);
    }
    public List<Eticket2> listAllEticket() {
        return this.eticket2Repository.findAllEticket();
    }

    // Methodes liées aux Rates construites avec les fonctions primales supérieures
    public List<Rate> listAllRates(Long eticketId) {
        Eticket2 eticket2 = obtainEticket(eticketId);
        return Collections.unmodifiableList(eticket2.getRates());
    }
}
