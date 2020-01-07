package com.projetEbilleterie.ebilleterie.domain.eticket2;
import com.projetEbilleterie.ebilleterie.domain.rate.Rate;

import java.util.ArrayList;
import java.util.List;

public class Eticket2 {

    private Long id;
    private Category category;
    private String reference;
    private String description;
    private String  law;
    private boolean nominative;
    private String validityDate ;
    private List<Rate> rates = new ArrayList<>();
    private String  image;
    private String provider;

    // Contructors
    public Eticket2(){}

    public Eticket2(Long id, Category category,String reference, String description, String law,
                   boolean nominative, String validityDate, List<Rate> rates,String  image,
                    String provider) {
        this.id = id;
        this.category= category;
        this.reference = reference;
        this.description = description;
        this.law = law;
        this.nominative = nominative;
        this.validityDate = validityDate;
        this.rates = rates;
        this.image = image;
        this.provider = provider;
        }

    //Getter
    public Long getId() { return id;}
    public Category getCategory() {return category;}
    public String getReference() {return reference;}
    public String getDescription() { return description;}
    public String getLaw() { return law; }
    public boolean isNominative() { return nominative;}
    public String getValidityDate() {return validityDate;}
    public List<Rate> getRates() {return rates;}
    public String getImage() { return image; }
    public String getProvider() { return provider;}

    // Methode equals, hashcode et to string, notement pour les test d'equals sur l'Id
    // -------------------------------------------------------------------------------
    @Override public boolean equals(Object obj) {
        if(obj == null) {return false; }
        if(!this.getClass().isAssignableFrom(obj.getClass())) {return false; }
        Eticket2 that = this.getClass().cast(obj);
        return that.id.equals(this.id);
    }

    @Override public int hashCode() {
        return this.id.hashCode();
    }

    @Override public String toString() {
        return String.format("%s{id:%s)", this.getClass().getSimpleName(), id);
    }

}
