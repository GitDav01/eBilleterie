package com.projetEbilleterie.ebilleterie.domain.provider;

import java.util.List;

public interface ProviderRepository {

    Provider get(String id);
    List<Provider> findAll();
}
