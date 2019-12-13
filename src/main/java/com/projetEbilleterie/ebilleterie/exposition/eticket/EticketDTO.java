package com.projetEbilleterie.ebilleterie.exposition.eticket;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EticketDTO {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    String id;
    @JsonProperty
    String description;
    @JsonProperty
    String  law;
    @JsonProperty
    boolean nominatif;
    @JsonProperty
    String dateValidite ;
    @JsonProperty
     double InternalPrice;
    @JsonProperty
    double ExternalPrice;
    @JsonProperty
    String chlidScale ;
    @JsonProperty
    String adultScale;

    //Constructors
   public  EticketDTO(){};

    public EticketDTO(String id, String description, String law,
                      boolean nominatif, String dateValidite, double internalPrice,
                      double externalPrice, String chlidScale, String adultScale) {
        this.id = id;
        this.description = description;
        this.law = law;
        this.nominatif = nominatif;
        this.dateValidite = dateValidite;
        InternalPrice = internalPrice;
        ExternalPrice = externalPrice;
        this.chlidScale = chlidScale;
        this.adultScale = adultScale;
    }

    //Getter

    public String getId() {
        return id;
    }
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
    public double getInternalPrice() {
        return InternalPrice;
    }
    public double getExternalPrice() {
        return ExternalPrice;
    }
    public String getChlidScale() {
        return chlidScale;
    }
    public String getAdultScale() {
        return adultScale;
    }
}
