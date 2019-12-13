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

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "LAW")
    private String  law;

    @Column(name = "NOMINATIF")
    private boolean nominatif;

    @Column(name = "DATE_VALIDITED")
    private String dateValidite ;

    @Column(name = "INTERNAL_PRICE")
    private double internalPrice;

    @Column(name = "EXTERNAL_PRICE")
    private double externalPrice;

    @Column(name = "CHILD_SCALE")
    private String chlidScale ;

    @Column(name = "ADULT_SCALE")
    private String adultScale;
    ;

    //Constructors
    public EticketJPA(){};
    public EticketJPA(Eticket eticket) {
        this.id = eticket.getId();
        this.description = eticket.getDescription();
        this.law = eticket.getLaw();
        this.nominatif = eticket.isNominatif();
        this.dateValidite = eticket.getDateValidite();
        this.internalPrice = eticket.getInternalPrice();
        this.externalPrice =eticket.getExternalPrice();
        this.chlidScale = eticket.getChlidScale();
        this.adultScale = eticket.getAdultScale();
    }

    //Getter
    public String getId() { return id; }
    public String getDescription() { return description; }
    public String getLaw() { return law;}
    public boolean isNominatif() { return nominatif; }
    public String getDateValidite() { return dateValidite; }
    public double getInternalPrice() {return internalPrice; }
    public double getExternalPrice() { return externalPrice;}
    public String getChlidScale() { return chlidScale; }
    public String getAdultScale() { return adultScale; }
}
