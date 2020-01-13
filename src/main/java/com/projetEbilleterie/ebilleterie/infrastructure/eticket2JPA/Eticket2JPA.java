package com.projetEbilleterie.ebilleterie.infrastructure.eticket2JPA;

import com.projetEbilleterie.ebilleterie.domain.eticket2.Category;
import com.projetEbilleterie.ebilleterie.domain.eticket2.Eticket2;
import com.projetEbilleterie.ebilleterie.domain.rate.Rate;
import com.projetEbilleterie.ebilleterie.infrastructure.rateJPA.RateJPA;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity(name = "ETICKET2")
public class Eticket2JPA {

    @Id
    @GeneratedValue()
    @Column(name = "ID")
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(name = "CATEGORY")
    private Category category;
    @Column(name = "REFERENCE")
    private String reference;
    @Size(max = 1000)
    @Column(name = "DESCRIPTION")
    private String description;
    @Size(max = 1000)
    @Column(name = "LAW")
    private String  law;
    @Column(name = "NOMINATIVE")
    private boolean nominative;
    @Column(name = "VALIDITY_DATE")
    private String validityDate ;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="ETICKET_ID", referencedColumnName = "ID")
    private List<RateJPA> rates  = new ArrayList<>();
    @Column(name = "IMAGE")
    private String  image;
    @Column(name = "PROVIDER")
    private String  provider;

    // Constructors
    //-------------
    public Eticket2JPA() {}

    public Eticket2JPA(Eticket2 eticket2) {
        this.id = eticket2.getId();
        this.category = eticket2.getCategory();
        this.reference = eticket2.getReference();
        this.description = eticket2.getDescription();
        this.law = eticket2.getLaw();
        this.nominative = eticket2.isNominative();
        this.validityDate = eticket2.getValidityDate();
        this.rates = eticket2.getRates()
                .stream()
                .map(RateJPA::new)
                .collect(Collectors.toList());
        this.image = eticket2.getImage();
        this.provider = eticket2.getProvider();
         }

    // Adapter JPA
    //------------
    Eticket2 toEticket2() {
        List<Rate> rateList = rates.stream()
                .map(b -> new Rate(b.getId(),b.getName(),b.getPrice(),b.getQuantity(),b.getTypePrice()))
                .collect(Collectors.toList());
                return new Eticket2(id, this.category,  this.reference, this.description,
                this.law,  this.nominative,  this.validityDate, rateList,
                this.image,this.provider);
    }

    //Getter
    //------
    public Long getId() { return id; }
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
