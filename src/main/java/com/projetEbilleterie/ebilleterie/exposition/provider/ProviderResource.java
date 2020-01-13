package com.projetEbilleterie.ebilleterie.exposition.provider;


import com.projetEbilleterie.ebilleterie.application.ProviderService;
import com.projetEbilleterie.ebilleterie.domain.provider.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ProviderResource {

    @Autowired
    ProviderService providerService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST, path = {"/provider"})
    @ResponseStatus(HttpStatus.CREATED)
    public void createProvider(@Valid @RequestBody ProviderDTO providerDTO) {
        this.providerService.createProvider(ProviderAdapter.transformToProvider(providerDTO));
    }
    @RequestMapping(method = RequestMethod.GET, path = {"/providers/{providerId}"})
    public ProviderDTO detailProvider(@PathVariable("providerId") Long eticketId) {
        return ProviderAdapter.adaptToProviderDTO(this.providerService.obtainProvider(eticketId));
    }
    @RequestMapping(method = RequestMethod.GET, path = {"/providers"})
    public List<ProviderDTO> listAllProviders() {
        return ProviderAdapter.adaptToProviderDTOList(this.providerService.listAllProvider());
    }
    // API for Provider's orders
    //-----------------------------

    @RequestMapping(method = RequestMethod.GET, path = {"/providers/{providerId}/orders"})
    public List<ProviderDTO.OrderDTO> listAllOrdersFromProvider(@PathVariable("providerId") Long providerId) {
        List<Order> orders = this.providerService.listAllOrders(providerId);
        return ProviderAdapter.adaptToOrderDTOList(orders);
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/providers/{providerId}/order"})
    @ResponseStatus(HttpStatus.CREATED)
    public void addOrderToProvider(@PathVariable("providerId") Long providerId, @RequestBody ProviderDTO.OrderDTO orderDTO) {
        this.providerService.addOrder(providerId, ProviderAdapter.transformToOrder(orderDTO));
    }

    @RequestMapping(method = RequestMethod.DELETE, path = {"/providers/{providerId}/orders/{orderId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeOrderFromProvider(@PathVariable("providerId") Long providerId, @PathVariable("orderId") Long orderId) {
        this.providerService.removeOrder(providerId, orderId);
    }

    @RequestMapping(method = RequestMethod.PUT, path = {"/providers/{providerId}/orders/{orderId}"})
    public void updateOrder(@PathVariable("providerId") Long providerId, @PathVariable("orderId") Long orderId,
                               @RequestBody ProviderDTO.OrderDTO orderDTO) {
        this.providerService.updateOrder(providerId, orderId, ProviderAdapter.transformToOrder(orderDTO));
    }


}
