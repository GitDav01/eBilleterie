package com.projetEbilleterie.ebilleterie.infrastructure.providerJPA;

import com.projetEbilleterie.ebilleterie.domain.provider.Category;
import com.projetEbilleterie.ebilleterie.domain.provider.Provider;


import javax.persistence.*;

@Entity(name = "PROVIDER")
public class ProviderJPA {

    @Id
    //@GeneratedValue()
    @Column(name = "ID")
    private String id;

    @Column(name = "NAME")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "CATEGORY")
    private Category category;

      //Constructors
    public ProviderJPA(){}

    ProviderJPA(Provider provider) {
        this.id = provider.getId();
        this.name = provider.getName();
        this.category = provider.getCategory();
     }

    // Adapter JPA
    Provider toProvider() {
       return new Provider(id, this.name, this.category);
    }
    //Getter
    public String getId() { return id;}
    public String getName() {return name; }
    public Category getCategory() { return category; }

}
