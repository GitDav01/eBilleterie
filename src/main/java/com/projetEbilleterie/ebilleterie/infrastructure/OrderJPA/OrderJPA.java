package com.projetEbilleterie.ebilleterie.infrastructure.OrderJPA;
import com.projetEbilleterie.ebilleterie.domain.provider.Order;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Entity(name = "ORDERS")
public class OrderJPA {

    @Id
    @GeneratedValue()
    @Column(name = "ORDERID")
    private Long orderId;
    @Column(name = "NAME")
    private String name;
    @Column(name = "QUANTITY")
    private Long quantity;
    @Column(name = "TIMESTAMP")
    private LocalDateTime ltimestamp;


    //Constructors
    public OrderJPA(){}



    //Adapter JPA
    Order toOrder() {
        return new Order(orderId, this.name,  this.quantity, this.ltimestamp);
    }

     public OrderJPA(Order toOrder) {
            this.orderId = toOrder.getOrderId();
            this.name = toOrder.getName();
            this.quantity = toOrder.getQuantity();
            this.ltimestamp = toOrder.getTimestamp();
        }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderJPA orderJPA = (OrderJPA) o;
        return name.equals(orderJPA.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getTimestamp() {
        return ltimestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.ltimestamp = timestamp;
    }
}