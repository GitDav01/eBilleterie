package com.projetEbilleterie.ebilleterie.exposition.provider;

import com.projetEbilleterie.ebilleterie.domain.eticket.Eticket;
import com.projetEbilleterie.ebilleterie.domain.provider.Provider;
import com.projetEbilleterie.ebilleterie.exposition.eticket.EticketAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public final class ProviderAdapter {

    public ProviderAdapter(){}

    public static ProviderDTO adaptToProviderDTO(Provider provider) {
        return new ProviderDTO(
                provider.getId(),
                provider.getName(),
                provider.getCategory(),
                EticketAdapter.adaptToEticketListDTO(provider.getEtickets())
                );
    }

    public static List<ProviderDTO> adaptToProviderDTOList(List<Provider> providers) {
        return providers.stream().map(ProviderAdapter::adaptToProviderDTO).collect(Collectors.toList());
    }

    public static Provider transformToProvider(ProviderDTO providerDTO) {

        String id = (providerDTO.id == null || providerDTO.id.trim().equals(""))? UUID.randomUUID().toString() : providerDTO.id;
        return new Provider(id,providerDTO.name,providerDTO.category,EticketAdapter.transformToEticketList(providerDTO.etickets));
    }


}
