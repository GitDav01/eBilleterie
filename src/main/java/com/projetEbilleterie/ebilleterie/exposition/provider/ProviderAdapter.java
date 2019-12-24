package com.projetEbilleterie.ebilleterie.exposition.provider;

import com.projetEbilleterie.ebilleterie.domain.provider.Provider;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public final class ProviderAdapter {

    public ProviderAdapter(){}

    static ProviderDTO adaptToProviderDTO(Provider provider) {
        return new ProviderDTO(
                provider.getId(),
                provider.getName(),
                provider.getCategory()
        );
    }

    static List<ProviderDTO> adaptToProviderDTOList(List<Provider> providers) {
        return providers.stream().map(ProviderAdapter::adaptToProviderDTO).collect(Collectors.toList());
    }

    static Provider transformToProvider(ProviderDTO providerDTO) {
        String id = (providerDTO.id == null || providerDTO.id.trim().equals(""))? UUID.randomUUID().toString() : providerDTO.id;
        return new Provider(id,providerDTO.name,providerDTO.category);
    }


}
