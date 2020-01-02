package com.projetEbilleterie.ebilleterie.infrastructure.rateJPA;

import com.projetEbilleterie.ebilleterie.domain.eticket.TypePrice;
import com.projetEbilleterie.ebilleterie.domain.rate.Rate;

import javax.persistence.*;

@Entity(name = "RATE")
public class RateJPA {

    @Id
    @GeneratedValue()
    private String id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "PRICE")
    private double price;
    @Column(name = "QUANTITY")
    private int quantity;
    @Enumerated(EnumType.STRING)
    @Column(name = "TYPE_PRICE")
    private TypePrice typePrice;
       // Constructors

    public RateJPA() {}

    public RateJPA(String id, String name, double price, int quantity, TypePrice typePrice) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.typePrice = typePrice;
    }

    // Adapter JPA
    Rate toRate() {
        return new Rate(id, this.name, this.price,  this.quantity,
                this.typePrice);
    }

    //Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() {return price; }
    public int getQuantity() {return quantity;}
    public TypePrice getTypePrice() {return typePrice;}
}
