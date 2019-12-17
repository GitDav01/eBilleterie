package com.projetEbilleterie.ebilleterie.infrastructure.providerJPA;

import com.projetEbilleterie.ebilleterie.domain.eticket.Eticket;
import com.projetEbilleterie.ebilleterie.domain.provider.Category;
import com.projetEbilleterie.ebilleterie.domain.provider.Provider;
import com.projetEbilleterie.ebilleterie.infrastructure.eticketJPA.EticketJPA;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

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

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="PROVIDER_ID", referencedColumnName = "ID")
    private List<EticketJPA> etickets ;

    //Constructors
    private ProviderJPA(){}

    ProviderJPA(Provider provider) {
        this.id = provider.getId();
        this.name = provider.getName();
        this.category = provider.getCategory();
        this.etickets = provider.getEtickets()
                .stream()
                .map(EticketJPA::new)
                .collect(Collectors.toList());
    }

    // Adapter JPA
    Provider toProvider() {

        List<Eticket> eticketList = etickets.stream()
                .map(b -> new Eticket(b.getId(),b.getReference(),b.getDescription(),b.getLaw(),
                        b.isNominatif(),b.getDateValidite(),b.getInternalAdultPrice(),
                        b.getExternalAdultPrice(), b.getInternalChildPrice(),b.getExternalChildPrice()))
                .collect(Collectors.toList());
        return new Provider(id, this.name, this.category,  eticketList);
    }
    //Getter
    public String getId() { return id;}
    public String getName() {return name; }
    public Category getCategory() { return category; }
    public List<EticketJPA> getEtickets() { return etickets; }
}
