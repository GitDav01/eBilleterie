package com.projetEbilleterie.ebilleterie.domain.basket2;

import com.projetEbilleterie.ebilleterie.domain.eticket.TypePrice;

import java.util.Date;

public class Basket2 {
    // Attributs
    private Long id;
    private int quantity;
    private boolean status;
    private String category;
    private String reference;
    private double price;
    private TypePrice typePrice;
    private Date purchaseDate;

    //Constructors
    public Basket2(){}

    public Basket2(Long id, int quantity, boolean status, String category, String reference,
                   double price, TypePrice typePrice, Date purchaseDate) {
        this.id = id;
        this.quantity = quantity;
        this.status = status;
        this.category = category;
        this.reference = reference;
        this.price = price;
        this.typePrice = typePrice;
        this.purchaseDate = purchaseDate;
    }

    // Méthode
    public void update(Basket2 basket2WithNewInformation) {
        this.quantity = basket2WithNewInformation.getQuantity();
        this.status = basket2WithNewInformation.isStatus();
        this.category = basket2WithNewInformation.getCategory();
        this.reference= basket2WithNewInformation.getReference();
        this.price = basket2WithNewInformation.getPrice();
        this.typePrice = basket2WithNewInformation.getTypePrice();
        this.purchaseDate= basket2WithNewInformation.getPurchaseDate();

    }
    //Getter
    public Long getId() {return id; }
    public int getQuantity() {return quantity; }
    public boolean isStatus() {return status;}
    public String getCategory() {return category;}
    public String getReference() {return reference;}
    public double getPrice() {return price;}
    public TypePrice getTypePrice() {return typePrice;}
    public Date getPurchaseDate() {return purchaseDate;}
    // Methode equals, hashcode et to string, notement pour les test d'equals sur l'Id

    @Override public boolean equals(Object obj) {
        if(obj == null) {return false; }
        if(!this.getClass().isAssignableFrom(obj.getClass())) {return false; }
        Basket2 that = this.getClass().cast(obj);
        return that.id.equals(this.id);
    }

    @Override public int hashCode() {
        return this.id.hashCode();
    }

    @Override public String toString() {
        return String.format("%s{id:%s)", this.getClass().getSimpleName(), id);
    }
}
