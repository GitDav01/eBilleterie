package com.projetEbilleterie.ebilleterie.domain.eticket2;

import java.util.List;

public interface Eticket2Repository {
    Eticket2 getEticket(String id);
    String saveEticket(Eticket2 newEticket);
    List<Eticket2> findAllEticket();

}
