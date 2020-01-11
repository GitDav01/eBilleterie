package com.projetEbilleterie.ebilleterie.domain.rate;

import com.projetEbilleterie.ebilleterie.domain.eticket2.TypePrice;

public class Rate {

    //Attributs
    private Long id;
    private String name;
    private double price;
    private int quantity;
    private TypePrice typePrice;


    // Constructors
    public Rate() {}

    public Rate(Long id, String name,double price, int quantity, TypePrice typePrice) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.typePrice = typePrice;
    }

    // Méthode
    public void update(Rate rateWithNewInformation) {
        this.name = rateWithNewInformation.getName();
        this.price = rateWithNewInformation.getPrice();
        this.quantity = rateWithNewInformation.getQuantity();
        this.typePrice = rateWithNewInformation.getTypePrice();
    }

    // Getter
    public Long getId() { return id; }
    public String getName() { return name; }
    public double getPrice() {return price; }
    public int getQuantity() {return quantity;}
    public TypePrice getTypePrice() {return typePrice;}
}
