package com.projetEbilleterie.ebilleterie.infrastructure.eticket2JPA;

import com.projetEbilleterie.ebilleterie.domain.basket.Basket;
import com.projetEbilleterie.ebilleterie.domain.eticket.Category;
import com.projetEbilleterie.ebilleterie.domain.eticket2.Eticket2;
import com.projetEbilleterie.ebilleterie.domain.rate.Rate;
import com.projetEbilleterie.ebilleterie.infrastructure.basketJPA.BasketJPA;
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
    private List<RateJPA> rates = new ArrayList<>();
    @Column(name = "IMAGE")
    private String  image;
    @Column(name = "PROVIDER")
    private String  provider;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="ETICKET_ID", referencedColumnName = "ID")
    private List<BasketJPA> baskets = new ArrayList<>();

    // Constructors

    public Eticket2JPA() {}

    public Eticket2JPA(Long id, Category category, String reference, @Size(max = 1000) String description,
                       @Size(max = 1000) String law, boolean nominative, String validityDate, List<RateJPA> rates,
                       String image, String provider,List<BasketJPA> baskets) {
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
        this.baskets = baskets;
    }

    // Adapter JPA
    Eticket2 toEticket2() {
        List<Rate> rateList = rates.stream()
                .map(b -> new Rate(b.getId(),b.getName(),b.getPrice(),b.getQuantity(),b.getTypePrice()))
                .collect(Collectors.toList());
        List<Basket> basketList = baskets.stream()
                .map(c -> new Basket(c.getId(),c.getQuantity(),c.isStatus())).collect(Collectors.toList());
        return new Eticket2(id, this.category,  this.reference, this.description,
                this.law,  this.nominative,  this.validityDate, rateList,
                this.image,this.provider, basketList);
    }

    //Getter
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
    public List<BasketJPA> getBaskets() {return baskets;}
}
