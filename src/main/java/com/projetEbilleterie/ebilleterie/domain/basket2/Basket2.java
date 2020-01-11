package com.projetEbilleterie.ebilleterie.domain.basket2;

import com.projetEbilleterie.ebilleterie.domain.eticket2.Category;
import com.projetEbilleterie.ebilleterie.domain.eticket2.TypePrice;

import java.util.Date;

public class Basket2 {
    // Attributs
    private Long id;
    private int quantity;
    private boolean status;
    private Category category;
    private String reference;
    private double price;
    private TypePrice typePrice;
    private Date purchaseDate;
    private String relativeName;

    //Constructors
    public Basket2(){}

    public Basket2(Long id, int quantity, boolean status, Category category, String reference,
                   double price, TypePrice typePrice, Date purchaseDate, String relativeName) {
        this.id = id;
        this.quantity = quantity;
        this.status = status;
        this.category = category;
        this.reference = reference;
        this.price = price;
        this.typePrice = typePrice;
        this.purchaseDate = purchaseDate;
        this.relativeName = relativeName;
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
        this.relativeName = basket2WithNewInformation.getRelativeName();

    }
    //Getter
    public Long getId() {return id; }
    public int getQuantity() {return quantity; }
    public boolean isStatus() {return status;}
    public Category getCategory() {return category;}
    public String getReference() {return reference;}
    public double getPrice() {return price;}
    public TypePrice getTypePrice() {return typePrice;}
    public Date getPurchaseDate() {return purchaseDate;}
    public String getRelativeName() {return relativeName;}

    // Methode equals, hashcode et to string, notement pour les test d'equals sur l'Id
    //-------------------------------------------------------------------------------
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
