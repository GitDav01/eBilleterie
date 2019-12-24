package com.projetEbilleterie.ebilleterie.infrastructure.eticketJPA;

import com.projetEbilleterie.ebilleterie.domain.eticket.Category;
import com.projetEbilleterie.ebilleterie.domain.eticket.Eticket;
import com.projetEbilleterie.ebilleterie.domain.eticket.TypePrice;

import javax.persistence.*;

@Entity(name = "ETICKET")
public class EticketJPA {
    @Id
    //@GeneratedValue()
    @Column(name = "ID")
    private String id;
    @Enumerated(EnumType.STRING)
    @Column(name = "CATEGORY")
    private Category category;
    @Column(name = "REFERENCE")
    private String reference;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "LAW")
    private String  law;
    @Column(name = "NOMINATIVE")
    private boolean nominative;
    @Column(name = "VALIDITY_DATE")
    private String validityDate ;
    @Enumerated(EnumType.STRING)
    @Column(name = "TYPE_PRICE")
    private TypePrice typePrice;
    @Column(name = "PRICE")
    private double price;
    @Column(name = "STOCK")
    private int stock ;
    @Column(name = "LOGO")
    private String  logo;

    //Constructors
    public EticketJPA(){}

    public EticketJPA(Eticket eticket) {
        this.id = eticket.getId();
        this.category=eticket.getCategory();
        this.reference = eticket.getReference();
        this.description = eticket.getDescription() ;
        this.law = eticket.getLaw();
        this.nominative = eticket.isNominative();
        this.validityDate = eticket.getValidityDate();
        this.typePrice = eticket.getTypePrice() ;
        this.price = eticket.getPrice();
        this.stock = eticket.getStock();
        this.logo = eticket.getLogo();
    }

    // Adapter JPA
    Eticket toEticket() {
        return new Eticket(id, this.category,  this.reference, this.description,
                this.law,  this.nominative,  this.validityDate, this.typePrice,
                this.price , this.stock, this.logo );
    }

    //Getter
    public String getId() { return id; }
    public Category getCategory() { return category; }
    public String getReference() {return reference;}
    public String getDescription() { return description; }
    public String getLaw() { return law;}
    public boolean isNominative() { return nominative; }
    public String getValidityDate() { return validityDate; }
    public TypePrice getTypePrice() {return typePrice; }
    public double getPrice() { return price;}
    public int getStock() { return stock; }
    public String getLogo() { return logo;}

}
