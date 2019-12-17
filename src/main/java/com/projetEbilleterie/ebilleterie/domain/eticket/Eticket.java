package com.projetEbilleterie.ebilleterie.domain.eticket;

public class Eticket {
    private String id;
    private String reference;
    private String description;
    private String  law;
    private boolean nominatif;
    private String dateValidite ;
    private double internalAdultPrice;
    private double externalAdultPrice;
    private double internalChildPrice;
    private double externalChildPrice;

    // Contructors
    public Eticket(){}

       public Eticket(String id, String reference, String description, String law,
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
    public String getId() { return id; }
    public String getReference() {return reference;}
    public String getDescription() { return description; }
    public String getLaw() { return law; }
    public boolean isNominatif() { return nominatif; }
    public String getDateValidite() {return dateValidite; }
    public double getInternalAdultPrice() {return internalAdultPrice;}
    public double getExternalAdultPrice() {return externalAdultPrice;}
    public double getInternalChildPrice() {return internalChildPrice; }
    public double getExternalChildPrice() {return externalChildPrice; }


    // Methode equals, hashcode et to string, notement pour les test d'equals sur l'Id

    @Override public boolean equals(Object obj) {
        if(obj == null) {return false; }
        if(!this.getClass().isAssignableFrom(obj.getClass())) {return false; }
        Eticket that = this.getClass().cast(obj);
        return that.id.equals(this.id);
    }

    @Override public int hashCode() {
        return this.id.hashCode();
    }

    @Override public String toString() {
        return String.format("%s{id:%s)", this.getClass().getSimpleName(), id);
    }


}



