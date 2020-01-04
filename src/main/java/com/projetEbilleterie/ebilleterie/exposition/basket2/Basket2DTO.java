package com.projetEbilleterie.ebilleterie.exposition.basket2;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.projetEbilleterie.ebilleterie.domain.eticket.TypePrice;

import java.util.Date;

public class Basket2DTO {

 //   @JsonProperty(access = JsonProperty.Access.READ_ONLY)
 //   Long id;
    @JsonProperty
    int quantity;
    @JsonProperty
    boolean status;
    @JsonProperty
    String category;
    @JsonProperty
    String reference;
    @JsonProperty
    double price;
    @JsonProperty
    TypePrice typePrice;
    @JsonProperty
    Date purchaseDate;

    //Constructors
    public Basket2DTO(){}

    public Basket2DTO(/*Long id, */ int quantity, boolean status, String category, String reference,
                      double price, TypePrice typePrice, Date purchaseDate) {
     //   this.id = id;
        this.quantity = quantity;
        this.status = status;
        this.category = category;
        this.reference = reference;
        this.price = price;
        this.typePrice = typePrice;
        this.purchaseDate = purchaseDate;
    }

    //Getter
 //   public Long getId() {return id;}
    public int getQuantity() { return quantity;}
    public boolean isStatus() { return status;}
    public String getCategory() {return category;}
    public String getReference() {return reference;}
    public double getPrice() {return price;}
    public TypePrice getTypePrice() {return typePrice;}
    public Date getPurchaseDate() {return purchaseDate;}
}
