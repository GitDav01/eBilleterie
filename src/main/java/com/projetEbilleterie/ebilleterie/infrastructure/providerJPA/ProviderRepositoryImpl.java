package com.projetEbilleterie.ebilleterie.infrastructure.providerJPA;

import com.projetEbilleterie.ebilleterie.domain.exception.ErrorCodes;
import com.projetEbilleterie.ebilleterie.domain.exception.MyAppTicketException;
import com.projetEbilleterie.ebilleterie.domain.provider.Provider;
import com.projetEbilleterie.ebilleterie.domain.provider.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ProviderRepositoryImpl implements ProviderRepository {

    @Autowired
    private ProviderDAO providerDAO;

    @Override
    public String save(Provider provider) {
        ProviderJPA providerJPA = providerDAO.save(new ProviderJPA(provider));
        return providerJPA.getId();
    }

    @Override
    public Provider get(String id) {
        return providerDAO.findById(id)
                .map(ProviderJPA::toProvider)
                .orElseThrow(()
                -> new MyAppTicketException(ErrorCodes.LIBRARY_NOT_FOUND));
    }

    @Override
     public List<Provider> findAll() {
        return providerDAO.findAll()
                .stream()
                .map(ProviderJPA::toProvider)
                .collect(Collectors.toList());
     }
}
