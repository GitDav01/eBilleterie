package com.projetEbilleterie.ebilleterie.domain.eticket;

import java.util.List;

public interface EticketRepository {

    Eticket getEticket(String id);
    String saveEticket(Eticket newEticket);
    List<Eticket> findAllEticket();
}
