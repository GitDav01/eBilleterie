package com.projetEbilleterie.ebilleterie.domain.provider;

import java.util.List;

public interface ProviderRepository {

    String save(Provider newProvider);
    Provider get(String id);
    List<Provider> findAll();

}
