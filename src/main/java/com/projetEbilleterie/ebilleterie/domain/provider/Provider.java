package com.projetEbilleterie.ebilleterie.domain.provider;
//import com.projetEbilleterie.ebilleterie.domain.rate.Rate;

import com.projetEbilleterie.ebilleterie.domain.exception.ErrorCodes;
import com.projetEbilleterie.ebilleterie.domain.exception.MyAppTicketException;
import com.projetEbilleterie.ebilleterie.domain.provider.Order;
import com.projetEbilleterie.ebilleterie.domain.relative.Relative;

import java.util.ArrayList;
import java.util.List;

public class Provider {

    private Long id;
    private Category category;
    private String reference;
    private String description;
    private String  law;
    private boolean nominative;
    private String validityDate ;
    private List<Order> orders;
    private String  image;
    private String provider;

    // Contructors
    public Provider(){}

    public Provider(Long id, Category category, String reference, String description, String law,
                    boolean nominative, String validityDate, List<Order> orders, String  image,
                    String provider) {
        this.id = id;
        this.category= category;
        this.reference = reference;
        this.description = description;
        this.law = law;
        this.nominative = nominative;
        this.validityDate = validityDate;
        this.orders=orders;
        this.image = image;
        this.provider = provider;
        }

    //Getter
    public Long getId() { return id;}
    public Category getCategory() {return category;}
    public String getReference() {return reference;}
    public String getDescription() { return description;}
    public String getLaw() { return law; }
    public boolean isNominative() { return nominative;}
    public String getValidityDate() {return validityDate;}
    public List<Order> getOrders() {return orders;}
    public String getImage() { return image; }
    public String getProvider() { return provider;}

    // Methode equals, hashcode et to string, notement pour les test d'equals sur l'Id
    // -------------------------------------------------------------------------------
    @Override public boolean equals(Object obj) {
        if(obj == null) {return false; }
        if(!this.getClass().isAssignableFrom(obj.getClass())) {return false; }
        Provider that = this.getClass().cast(obj);
        return that.id.equals(this.id);
    }

    @Override public int hashCode() {
        return this.id.hashCode();
    }

    @Override public String toString() {
        return String.format("%s{id:%s)", this.getClass().getSimpleName(), id);
    }
    // Méthode liées aux Orders
    //-----------------------------
    private Order searchOrder(Long orderId) {
        Order order = this.orders.stream()
                .filter(l -> l.getOrderId().equals(orderId))
                .findFirst().orElseThrow(() -> new MyAppTicketException(ErrorCodes.RELATIVE_NOT_FOUND));
        return order;
    }
    public void addOrder(Order order) {
        this.getOrders().add(order);
    }

    public void removeOrder(Long orderId) {
        Order order = searchOrder(orderId);
        this.orders.remove(order);
    }

    public void updateOrder(Long orderId, Order orderWithNewInformation) {
        Order order = searchOrder(orderId);
        order.update(orderWithNewInformation);
    }
}

