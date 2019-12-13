package com.projetEbilleterie.ebilleterie.application;

import com.projetEbilleterie.ebilleterie.domain.provider.Provider;
import com.projetEbilleterie.ebilleterie.domain.provider.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ProviderService {

    @Autowired
    private ProviderRepository providerRepository;

    public Provider obtain(String id) {
        return this.providerRepository.get(id);
    }
    public List<Provider> listAll() {
        return this.providerRepository.findAll();
    }


}
