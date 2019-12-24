package com.projetEbilleterie.ebilleterie.application;

import com.projetEbilleterie.ebilleterie.domain.eticket.Eticket;
import com.projetEbilleterie.ebilleterie.domain.eticket.EticketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class EticketService {

    @Autowired
    private EticketRepository eticketRepository;

    public Eticket obtainEticket(String id) {return this.eticketRepository.getEticket(id); }
    public String createEticket(Eticket newEticket) {
        return this.eticketRepository.saveEticket(newEticket);
    }
    public List<Eticket> listAllEticket() {
        return this.eticketRepository.findAllEticket();
    }
}
