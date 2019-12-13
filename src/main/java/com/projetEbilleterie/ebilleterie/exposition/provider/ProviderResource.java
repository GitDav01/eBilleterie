package com.projetEbilleterie.ebilleterie.exposition.provider;

import com.projetEbilleterie.ebilleterie.application.ProviderService;
import com.projetEbilleterie.ebilleterie.domain.provider.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProviderResource {

    @Autowired
    private ProviderService providerService;

    @RequestMapping(method = RequestMethod.GET, path = {"/providers/{providerId}"})
    public ProviderDTO detailProvider(@PathVariable("providerId") String providerId) {
        return ProviderAdapter.adaptToProviderDTO(this.providerService.obtain(providerId));
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/providers"})
    public List<ProviderDTO> listAllProviders() {
        return ProviderAdapter.adaptToProviderDTOList(this.providerService.listAll());
    }

}
