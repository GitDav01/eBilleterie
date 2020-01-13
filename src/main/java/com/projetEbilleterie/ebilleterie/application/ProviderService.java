package com.projetEbilleterie.ebilleterie.application;

import com.projetEbilleterie.ebilleterie.domain.provider.Order;
import com.projetEbilleterie.ebilleterie.domain.provider.Provider;
import com.projetEbilleterie.ebilleterie.domain.provider.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Transactional
@Service
public class ProviderService {

    @Autowired
    private ProviderRepository providerRepository;

    public Provider obtainProvider(Long id) {return this.providerRepository.getProvider(id); }
    public Long createProvider(Provider newProvider) { return this.providerRepository.saveProvider(newProvider); }
    public List<Provider> listAllProvider() {
        return this.providerRepository.findAllProvider();
    }
    public Provider searchByNameQuery(String name) { return this.providerRepository.searchByNameQuery(name); }

     //Methodes liées aux Orders construites avec les fonctions primales supérieures
    public List<Order> listAllOrder(Long orderId) {
        Provider provider = obtainProvider(orderId);
        return Collections.unmodifiableList(provider.getOrders());
    }

    // Methodes liées aux Orders construites avec les fonctions primales supérieures
    //----------------------------------------------------------------------------------
    public List<Order> listAllOrders(Long providerId) {
        Provider provider = obtainProvider(providerId);
        return Collections.unmodifiableList(provider.getOrders());
    }
    public void addOrder(Long providerId, Order order) {
        Provider provider = obtainProvider(providerId);
        provider.addOrder(order);
        this.providerRepository.saveProvider(provider);
    }
    public void removeOrder(Long providerId, Long orderId) {
        Provider provider = obtainProvider(providerId);
        provider.removeOrder(orderId);
        this.providerRepository.saveProvider(provider);
    }

    public void updateOrder(Long providerId, Long orderId, Order order) {
        Provider provider = obtainProvider(providerId);
        provider.updateOrder(orderId, order);
        this.providerRepository.saveProvider(provider);
    }

}
