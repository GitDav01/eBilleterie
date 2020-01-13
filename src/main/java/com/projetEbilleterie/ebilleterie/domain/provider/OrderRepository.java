package com.projetEbilleterie.ebilleterie.domain.provider;

import java.util.List;

public interface OrderRepository {

    //   Relative getRelative(Lnng id) ;
    List<Order> findAllOrder();
}