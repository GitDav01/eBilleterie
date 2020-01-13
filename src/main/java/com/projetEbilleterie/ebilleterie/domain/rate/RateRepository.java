package com.projetEbilleterie.ebilleterie.domain.rate;

import com.projetEbilleterie.ebilleterie.domain.eticket2.TypePrice;

import java.util.List;

public interface RateRepository {

    Rate getRate(Long id);
    List<Rate> findAllRate();
}
