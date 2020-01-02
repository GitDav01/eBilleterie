package com.projetEbilleterie.ebilleterie.domain.rate;

import java.util.List;

public interface RateRepository {

    Rate getRate(Long id);
    List<Rate> findAllRate();
}
