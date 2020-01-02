package com.projetEbilleterie.ebilleterie.domain.rate;

import java.util.List;

public interface RateRepository {

    Rate getRate(String id);
    List<Rate> findAllRate();
}
