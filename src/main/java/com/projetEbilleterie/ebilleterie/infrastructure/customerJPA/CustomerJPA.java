package com.projetEbilleterie.ebilleterie.infrastructure.customerJPA;


import com.projetEbilleterie.ebilleterie.domain.customer.Customer;
import com.projetEbilleterie.ebilleterie.domain.customer.Relative;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;
// Attributs
//private String id;
//private String lastname;
//private String firstname;
//private Profil profil;
//private Link link;
//private Basket basket;
//private List<Relative> relatives = new ArrayList<>();

@Entity(name = "CUSTOMER")
public class CustomerJPA {

    @Id
    //@GeneratedValue()
    @Column(name = "ID")
    private String id;

    @Column(name = "LASTNAME")
    private String lastname;

    @Column(name = "FIRSTNAME")
    private String firstname;

    @Enumerated(EnumType.STRING)
    @Column(name = "PROFIL")
    //private Profil profil;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="CUSTOMER_ID", referencedColumnName = "ID")
    private List<Relative> relatives ;

    //Constructors
    private CustomerJPA(){};
    public CustomerJPA(Customer customer) {
        this.id = customer.getId();
        this.lastname = customer.getLastname();
        this.firstname = customer.getFirstname();
        this.profil = customer.getProfil();
        this.relatives = customer.getRelatives()
                .stream()
                .map(RelativeJPA::new)
                .collect(Collectors.toList());
    }

    public Customer toCustomer() {

        List<Relative> relativeList = relatives.stream()
                .map(b -> new Relative(b.getId(),b.getDescription(),b.getLaw(),
                        b.isNominatif(),b.getDateValidite(),b.getInternalPrice(),
                        b.getExternalPrice(),  b.getChlidScale(),b.getAdultScale()))
                .collect(Collectors.toList());
        return new Customer(id, this.name, this.category,  relativeList);
    }
    //Getter
    public String getId() { return id;}
    public String getName() {return name; }
    public Category getCategory() { return category; }
    public List<RelativeJPA> getRelatives() { return relatives; }
}
