package com.projetEbilleterie.ebilleterie.exposition.provider;

import com.projetEbilleterie.ebilleterie.domain.eticket.Eticket;
import com.projetEbilleterie.ebilleterie.domain.provider.Provider;
import com.projetEbilleterie.ebilleterie.exposition.eticket.EticketAdapter;

import java.util.List;
import java.util.stream.Collectors;

public final class ProviderAdapter {

    public static ProviderDTO adaptToProviderDTO(Provider provider) {
        return new ProviderDTO(
                provider.getId(),
                provider.getName(),
                provider.getCategory(),
                provider.getEtickets());
    }

    public static List<ProviderDTO> adaptToProviderDTOList(List<Provider> providers) {
        return providers.stream().map(ProviderAdapter::adaptToProviderDTO).collect(Collectors.toList());
    }

}
