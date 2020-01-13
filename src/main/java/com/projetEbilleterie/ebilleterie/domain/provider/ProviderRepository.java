package com.projetEbilleterie.ebilleterie.domain.provider;

import com.projetEbilleterie.ebilleterie.domain.customer.Customer;

import java.util.Collections;
import java.util.List;

public interface ProviderRepository {
    Provider getProvider(Long id);
    Provider searchByNameQuery(String name);
    Long saveProvider(Provider newProvider);
    List<Provider> findAllProvider();


}
