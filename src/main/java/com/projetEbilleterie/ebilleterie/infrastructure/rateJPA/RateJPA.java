package com.projetEbilleterie.ebilleterie.infrastructure.rateJPA;

import com.projetEbilleterie.ebilleterie.domain.eticket2.TypePrice;
import com.projetEbilleterie.ebilleterie.domain.rate.Rate;

import javax.persistence.*;

@Entity(name = "RATE")
public class RateJPA {

    @Id
    @GeneratedValue()
    private Long id;
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

    public RateJPA(Rate rate) {
        this.id = rate.getId();
        this.name = rate.getName();
        this.price = rate.getPrice();
        this.quantity = rate.getQuantity();
        this.typePrice = rate.getTypePrice();
    }

    // Adapter JPA
    Rate toRate() {
        return new Rate(id, this.name, this.price,  this.quantity,
                this.typePrice);
    }

    //Getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public double getPrice() {return price; }
    public int getQuantity() {return quantity;}
    public TypePrice getTypePrice() {return typePrice;}
}
