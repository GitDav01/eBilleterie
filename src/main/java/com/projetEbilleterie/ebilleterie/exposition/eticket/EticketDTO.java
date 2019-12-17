package com.projetEbilleterie.ebilleterie.exposition.eticket;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EticketDTO {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    String id;
    @JsonProperty
    String reference;
    @JsonProperty
    String description;
    @JsonProperty
    String  law;
    @JsonProperty
    boolean nominatif;
    @JsonProperty
    String dateValidite ;
    @JsonProperty
    double internalAdultPrice;
    @JsonProperty
    double externalAdultPrice;
    @JsonProperty
    double internalChildPrice ;
    @JsonProperty
    double externalChildPrice;

    //Constructors
   public  EticketDTO(){}

    public EticketDTO(String id, String reference, String description, String law,
                      boolean nominatif, String dateValidite, double internalAdultPrice,
                      double externalAdultPrice, double internalChildPrice, double externalChildPrice) {
        this.id = id;
        this.reference = reference;
        this.description = description;
        this.law = law;
        this.nominatif = nominatif;
        this.dateValidite = dateValidite;
        this.internalAdultPrice = internalAdultPrice;
        this.externalAdultPrice = externalAdultPrice;
        this.internalChildPrice = internalChildPrice;
        this.externalChildPrice = externalChildPrice;
    }

    //Getter

    public String getId() {
        return id;
    }
    public String getReference() { return reference; }
    public String getDescription() {
        return description;
    }
    public String getLaw() {
        return law;
    }
    public boolean isNominatif() {
        return nominatif;
    }
    public String getDateValidite() {
        return dateValidite;
    }
    public double getInternalAdultPrice() {
        return internalAdultPrice;
    }
    public double getExternalAdultPrice() {
        return externalAdultPrice;
    }
    public double getInternalChildPrice() {
        return internalChildPrice;
    }
    public double getExternalChildPrice() {
        return externalChildPrice;
    }
}
