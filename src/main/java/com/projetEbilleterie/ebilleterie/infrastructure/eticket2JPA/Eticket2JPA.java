package com.projetEbilleterie.ebilleterie.infrastructure.eticket2JPA;

import com.projetEbilleterie.ebilleterie.domain.eticket.Category;
import com.projetEbilleterie.ebilleterie.domain.eticket.TypePrice;
import com.projetEbilleterie.ebilleterie.infrastructure.eticketJPA.EticketJPA;
import com.projetEbilleterie.ebilleterie.infrastructure.rateJPA.RateJPA;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "ETICKET2")
public class Eticket2JPA {

    @Id
    //@GeneratedValue()
    @Column(name = "ID")
    private String id;
    @Enumerated(EnumType.STRING)
    @Column(name = "CATEGORY")
    private Category category;
    @Column(name = "REFERENCE")
    private String reference;
    @Size(max = 1337)
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "LAW")
    private String  law;
    @Column(name = "NOMINATIVE")
    private boolean nominative;
    @Column(name = "VALIDITY_DATE")
    private String validityDate ;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="ETICKET_ID", referencedColumnName = "ID")
    private List<RateJPA> rates = new ArrayList<>();

    @Column(name = "IMAGE")
    private String  image;
    @Column(name = "PROVIDER")
    private String  provider;

    // Constructors

    public Eticket2JPA() {}

    public Eticket2JPA(String id, Category category, String reference, @Size(max = 1337) String description, String law,
                       boolean nominative, String validityDate, List<RateJPA> rates, String image, String provider) {
        this.id = id;
        this.category = category;
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
    public String getId() { return id; }
    public Category getCategory() { return category; }
    public String getReference() {return reference;}
    public String getDescription() { return description; }
    public String getLaw() { return law;}
    public boolean isNominative() { return nominative; }
    public String getValidityDate() { return validityDate; }
    public List<RateJPA> getRates() { return rates; }
    public String getImage() { return image;}
    public String getProvider() { return provider;}



}
