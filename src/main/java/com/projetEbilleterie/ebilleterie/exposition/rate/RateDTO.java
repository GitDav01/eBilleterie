package com.projetEbilleterie.ebilleterie.exposition.rate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.projetEbilleterie.ebilleterie.domain.eticket.TypePrice;

public class RateDTO {

    //    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    //   String id;
    @JsonProperty String name;
    @JsonProperty double price;
    @JsonProperty int quantity;
    @JsonProperty TypePrice typePrice;

    //Constructors
    RateDTO() {}

    public RateDTO(String name, double price, int quantity, TypePrice typePrice) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.typePrice = typePrice;
    }

    //Getter
    public String getName() {return name;}
    public double getPrice() {return price;}
    public int getQuantity() {return quantity;}
    public TypePrice getTypePrice() {return typePrice;}
}
