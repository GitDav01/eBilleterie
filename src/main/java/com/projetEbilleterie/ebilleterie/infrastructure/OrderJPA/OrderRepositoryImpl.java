package com.projetEbilleterie.ebilleterie.infrastructure.OrderJPA;

import com.projetEbilleterie.ebilleterie.domain.exception.ErrorCodes;
import com.projetEbilleterie.ebilleterie.domain.exception.MyAppTicketException;
import com.projetEbilleterie.ebilleterie.domain.provider.Order;
import com.projetEbilleterie.ebilleterie.domain.provider.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class OrderRepositoryImpl implements OrderRepository {

    @Autowired
    private OrderDAO orderDAO;
/*
    @Override
    public String saveOrder(Order order) {
        OrderJPA orderJPA = orderDAO.save(new OrderJPA(order));
        return orderJPA.getOrderId();
    }

    @Override
    public Order getOrder(String id) {
        return orderDAO.findById(id)
                .map(OrderJPA::toOrder)
                .orElseThrow(()
                -> new MyAppTicketException(ErrorCodes.RELATIVE_NOT_FOUND));
    }
*/
    @Override
    public List<Order> findAllOrder() {

        return orderDAO.findAll()
                .stream()
                .map(OrderJPA::toOrder)
                .collect(Collectors.toList());
    }

}

