package com.projetEbilleterie.ebilleterie.infrastructure.providerJPA;

import com.projetEbilleterie.ebilleterie.domain.provider.Provider;
import com.projetEbilleterie.ebilleterie.domain.provider.Category;
import com.projetEbilleterie.ebilleterie.domain.provider.Order;
import com.projetEbilleterie.ebilleterie.domain.provider.Provider;
import com.projetEbilleterie.ebilleterie.infrastructure.OrderJPA.OrderJPA;
import com.projetEbilleterie.ebilleterie.infrastructure.RelativeJPA.RelativeJPA;
//import com.projetEbilleterie.ebilleterie.domain.rate.Rate;
//import com.projetEbilleterie.ebilleterie.infrastructure.rateJPA.RateJPA;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity(name = "PROVIDER")
public class ProviderJPA {

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
    @JoinColumn(name="PROVIDER_ID", referencedColumnName = "ID")
    private List<OrderJPA> orders = new ArrayList<>();
    @Column(name = "IMAGE")
    private String  image;
    @Column(name = "PROVIDER")
    private String  provider;

    // Constructors

    public ProviderJPA() {}


         
    ProviderJPA(Provider provider) {
        this.id = provider.getId();
        this.category = provider.getCategory();
        this.reference = provider.getReference();
        this.description = provider.getDescription();
        this.law = provider.getLaw();
        this.nominative = provider.isNominative();
        this.validityDate = provider.getValidityDate();
        this.orders =  provider.getOrders()
                .stream()
                .map(OrderJPA::new)
                .collect(Collectors.toList());
        this.image = provider.getImage();
        this.provider = provider.getProvider();
    }


    // Adapter JPA
  Provider toProvider() {
        List<Order> orderList = orders.stream()
              .map(b -> new Order(b.getOrderId(),b.getName(),b.getQuantity(),b.getTimestamp()))
               .collect(Collectors.toList());
                return new Provider(id, this.category,  this.reference, this.description,
                this.law,  this.nominative,  this.validityDate, orderList,
                this.image,this.provider);

    }
    //Getter
    public Long getId() { return id; }
    public Category getCategory() { return category; }
    public String getReference() {return reference;}
    public String getDescription() { return description; }
    public String getLaw() { return law;}
    public boolean isNominative() { return nominative; }
    public String getValidityDate() { return validityDate; }
    public List<OrderJPA> getOrders() { return orders; }
    public String getImage() { return image;}
    public String getProvider() { return provider;}
  }
