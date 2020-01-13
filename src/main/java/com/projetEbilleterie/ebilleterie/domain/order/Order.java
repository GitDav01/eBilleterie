package com.projetEbilleterie.ebilleterie.domain.order;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Order implements Serializable {

    private Long orderId;
    private String name;
    private Long quantity;
    private LocalDateTime timestamp;

    // Constructors
    //------------
    public Order() {
    }

    public Order(Long orderId, String name, Long quantity, LocalDateTime timestamp) {
        this.orderId = orderId;
        this.name = name;
        this.quantity = quantity;
        this.timestamp = timestamp;
    }

    // Getter
    //-------
    public Long getOrderId()
    {
        return orderId;
    }
    public void setOrderId(Long orderId)
    {
        this.orderId = orderId;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Long getQuantity()
    {
        return quantity;
    }
    public void setQuantity(Long quantity)
    {
        this.quantity = quantity;
    }

    // Methode
    //--------
    @Override
    public String toString()
    {
        return "Order [orderId=" + orderId + ", name=" + name + ", quantity=" + quantity + ", timestamp=" + timestamp
                + "]";
    }
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override public int hashCode() {
        return this.orderId.hashCode();
    }
    @Override public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if(!this.getClass().isAssignableFrom(obj.getClass())) {
            return false;
        }
        Order that = this.getClass().cast(obj);
        return that.orderId.equals(this.orderId);
    }
}
