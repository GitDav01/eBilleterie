package com.projetEbilleterie.ebilleterie.application;

import com.projetEbilleterie.ebilleterie.domain.provider.Order;
import com.projetEbilleterie.ebilleterie.domain.provider.OrderRepository;
import com.projetEbilleterie.ebilleterie.domain.provider.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Transactional
@Service
public class OrderService {

    //public List<Order> listAllOrder() {
     //   return this.orderRepository.findAllOrder();
    //}
 //   @Autowired
 //   private OrderRepository orderRepository;
    @Autowired
    private ProviderService providerService;

    public List<Order> listAllOrder(Long providerId) {
        Provider provider = providerService.obtainProvider(providerId);
        return Collections.unmodifiableList(provider.getOrders());
    }

}
