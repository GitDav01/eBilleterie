package com.projetEbilleterie.ebilleterie.domain.eticket;

public class Eticket {
    private String id;
    private String description;
    private String  law;
    private boolean nominatif;
    private String dateValidite ;
    private double InternalPrice;
    private double ExternalPrice;
    private String chlidScale ;
    private String adultScale;

    // Contructors
    public Eticket(){};

    public Eticket(String id, String description, String law,
                   boolean nominatif, String dateValidite,
                   double internalPrice, double externalPrice,
                   String chlidScale, String adultScale) {
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
    public String getId() { return id; }
    public String getDescription() { return description; }
    public String getLaw() { return law; }
    public boolean isNominatif() { return nominatif; }
    public String getDateValidite() {return dateValidite; }
    public double getInternalPrice() {return InternalPrice;}
    public double getExternalPrice() {return ExternalPrice;}
    public String getChlidScale() {return chlidScale; }
    public String getAdultScale() {return adultScale; }
}



