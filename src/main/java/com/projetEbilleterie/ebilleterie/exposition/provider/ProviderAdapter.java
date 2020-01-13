package com.projetEbilleterie.ebilleterie.exposition.provider;

import com.projetEbilleterie.ebilleterie.domain.provider.Order;
import com.projetEbilleterie.ebilleterie.domain.provider.Provider;
import com.projetEbilleterie.ebilleterie.exposition.customer.CustomerAdapter;
import com.projetEbilleterie.ebilleterie.exposition.customer.CustomerDTO;
import com.projetEbilleterie.ebilleterie.exposition.provider.ProviderAdapter;
import com.projetEbilleterie.ebilleterie.exposition.provider.ProviderDTO;
//import com.projetEbilleterie.ebilleterie.exposition.rate.RateAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProviderAdapter {

    public static List<ProviderDTO> adaptToProvider2DTOList(List<Provider> providers) {
        return providers.stream().map(ProviderAdapter::adaptToProviderDTO).collect(Collectors.toList());
    }

    public static ProviderDTO adaptToProviderDTO(Provider provider) {
        return new ProviderDTO(
                provider.getId(),
                provider.getCategory(),
                provider.getReference(),
                provider.getDescription(),
                provider.getLaw(),
                provider.isNominative(),
                provider.getValidityDate(),
                ProviderAdapter.adaptToOrderDTOList(provider.getOrders()),
                provider.getImage(),
                provider.getProvider()
              );
    }

    public static List<Provider> transformToProviderList(List<ProviderDTO> providerDTO) {
        if(providerDTO == null) {return new ArrayList<>();}
        return providerDTO.stream().map(ProviderAdapter::transformToProvider).collect(Collectors.toList());
    }

    public static Provider transformToProvider(ProviderDTO providerDTO) {
       // String id = (providerDTO.id == null || providerDTO.id.trim().equals(""))? UUID.randomUUID().toString() : providerDTO.id;
        return new Provider(null, providerDTO.category,providerDTO.reference, providerDTO.description,providerDTO.law,providerDTO.nominative,
                providerDTO.validityDate, ProviderAdapter.transformToOrderList(providerDTO.orders),
                providerDTO.image,providerDTO.provider); 
    }
    static List<ProviderDTO> adaptToProviderDTOList(List<Provider> providers) {
        return providers.stream().map(ProviderAdapter::adaptToProviderDTO).collect(Collectors.toList());
    }

    // Adapter Order
    //-----------------
    public static ProviderDTO.OrderDTO adaptToOrderDTO(Order order) {
        return new ProviderDTO.OrderDTO(
                //   order.getId(),
                order.getName(),
                order.getQuantity(),
                order.getTimestamp()
        );
    }

    public static List<Order> transformToOrderList(List<ProviderDTO.OrderDTO> orderDTO) {
        if(orderDTO == null) {return new ArrayList<>();}
        return orderDTO.stream().map(ProviderAdapter::transformToOrder).collect(Collectors.toList());
    }

    public static List<ProviderDTO.OrderDTO> adaptToOrderDTOList(List<Order> orders) {
        return orders.stream().map(ProviderAdapter::adaptToOrderDTO).collect(Collectors.toList());
    }
  
    public static Order transformToOrder(ProviderDTO.OrderDTO orderDTO) {
        return new Order(null,orderDTO.name,orderDTO.quantity,orderDTO.timestamp);
    }

}
