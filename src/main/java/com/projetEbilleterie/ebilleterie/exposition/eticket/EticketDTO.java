package com.projetEbilleterie.ebilleterie.exposition.eticket;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.projetEbilleterie.ebilleterie.domain.eticket.Category;
import com.projetEbilleterie.ebilleterie.domain.eticket.TypePrice;

public class EticketDTO {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    String id;
    @JsonProperty
    Category category;
    @JsonProperty
    String reference;
    @JsonProperty
    String description;
    @JsonProperty
    String  law;
    @JsonProperty
    boolean nominative;
    @JsonProperty
    String validityDate ;
    @JsonProperty
    TypePrice typePrice;
    @JsonProperty
    double price;
    @JsonProperty
    int stock ;
    @JsonProperty
    String  logo;

    //Constructors
   public  EticketDTO(){}

    public EticketDTO(String id, Category category, String reference, String description, String law,
                      boolean nominative, String validityDate, TypePrice typePrice,
                      double price, int stock,  String  logo) {
        this.id = id;
        this.category = category;
        this.reference = reference;
        this.description = description;
        this.law = law;
        this.nominative = nominative;
        this.validityDate = validityDate;
        this.typePrice = typePrice;
        this.price = price;
        this.stock = stock;
        this.logo = logo;
    }

    //Getter

    public String getId() {
        return id;
    }
    public Category getCategory() {return category;}
    public String getReference() { return reference; }
    public String getDescription() {
        return description;
    }
    public String getLaw() {
        return law;
    }
    public boolean isNominative() {
        return nominative;
    }
    public String getValidityDate() {
        return validityDate;
    }
    public TypePrice getTypePrice() {
        return typePrice;
    }
    public double getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
    public String getLogo() {
        return logo;
    }

}
