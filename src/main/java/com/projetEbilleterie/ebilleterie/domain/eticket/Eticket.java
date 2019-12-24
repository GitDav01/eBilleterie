package com.projetEbilleterie.ebilleterie.domain.eticket;

public class Eticket {
    private String id;
    private Category category;
    private String reference;
    private String description;
    private String  law;
    private boolean nominative;
    private String validityDate ;
    private TypePrice typePrice;
    private double price;
    private int stock;
    private String  logo;

    // Contructors
    public Eticket(){}

       public Eticket(String id, Category category,String reference, String description, String law,
                      boolean nominative, String validityDate, TypePrice typePrice,
                      double price, int stock,String  logo) {
        this.id = id;
        this.category= category;
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
    public String getId() { return id; }
    public Category getCategory() {return category; }
    public String getReference() {return reference;}
    public String getDescription() { return description; }
    public String getLaw() { return law; }
    public boolean isNominative() { return nominative; }
    public String getValidityDate() {return validityDate; }
    public TypePrice getTypePrice() {return typePrice;}
    public double getPrice() {return price;}
    public int getStock() {return stock; }
    public String getLogo() { return logo; }

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



