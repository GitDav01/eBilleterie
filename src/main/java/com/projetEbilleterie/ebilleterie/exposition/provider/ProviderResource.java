package com.projetEbilleterie.ebilleterie.exposition.provider;

import com.projetEbilleterie.ebilleterie.application.ProviderService;
import com.projetEbilleterie.ebilleterie.domain.provider.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ProviderResource {

    @Autowired
    private ProviderService providerService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST, path = {"/providers"})
    @ResponseStatus(HttpStatus.CREATED)
    public void createProvider(@Valid @RequestBody ProviderDTO providerDTO) {
        this.providerService.create(ProviderAdapter.transformToProvider(providerDTO));
    }
    @RequestMapping(method = RequestMethod.GET, path = {"/providers/{providerId}"})
    public ProviderDTO detailProvider(@PathVariable("providerId") String providerId) {
        return ProviderAdapter.adaptToProviderDTO(this.providerService.obtain(providerId));
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/providers"})
    public List<ProviderDTO> listAllProviders() {
        return ProviderAdapter.adaptToProviderDTOList(this.providerService.listAll());
    }

}
