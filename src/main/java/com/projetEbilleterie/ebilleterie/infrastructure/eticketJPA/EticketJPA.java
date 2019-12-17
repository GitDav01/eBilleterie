package com.projetEbilleterie.ebilleterie.infrastructure.eticketJPA;

import com.projetEbilleterie.ebilleterie.domain.eticket.Eticket;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "ETICKET")
public class EticketJPA {
    @Id
    //@GeneratedValue()
    @Column(name = "ID")
    private String id;

    @Column(name = "REFERENCE")
    private String reference;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "LAW")
    private String  law;

    @Column(name = "NOMINATIF")
    private boolean nominatif;

    @Column(name = "DATE_VALIDITE")
    private String dateValidite ;

    @Column(name = "INTERNAL_ADULT_PRICE")
    private double internalAdultPrice;

    @Column(name = "EXTERNAL_ADULT_PRICE")
    private double externalAdultPrice;

    @Column(name = "INTERNAL_CHILD_PRICE")
    private double internalChildPrice ;

    @Column(name = "EXTERNAL_CHILD_PRICE")
    private double externalChildPrice;

    //Constructors
    public EticketJPA(){}

    public EticketJPA(Eticket eticket) {
        this.id = eticket.getId();
        this.reference = eticket.getReference();
        this.description = eticket.getDescription() ;
        this.law = eticket.getLaw();
        this.nominatif = eticket.isNominatif();
        this.dateValidite = eticket.getDateValidite();
        this.internalAdultPrice = eticket.getInternalAdultPrice() ;
        this.externalAdultPrice = eticket.getExternalAdultPrice();
        this.internalChildPrice = eticket.getInternalChildPrice();
        this.externalChildPrice = eticket.getExternalChildPrice();
    }


    //Getter
    public String getId() { return id; }
    public String getReference() {return reference;}
    public String getDescription() { return description; }
    public String getLaw() { return law;}
    public boolean isNominatif() { return nominatif; }
    public String getDateValidite() { return dateValidite; }
    public double getInternalAdultPrice() {return internalAdultPrice; }
    public double getExternalAdultPrice() { return externalAdultPrice;}
    public double getInternalChildPrice() { return internalChildPrice; }
    public double getExternalChildPrice() { return externalChildPrice; }


}
