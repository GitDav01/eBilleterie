package com.projetEbilleterie.ebilleterie.infrastructure.customerJPA;

import com.projetEbilleterie.ebilleterie.domain.customer.Customer;
import com.projetEbilleterie.ebilleterie.domain.customer.Profil;
import com.projetEbilleterie.ebilleterie.infrastructure.RelativeJPA.RelativeJPA;
import com.projetEbilleterie.ebilleterie.infrastructure.basketJPA.BasketJPA;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity(name = "CUSTOMER")
public class CustomerJPA {

    @Id
    //@GeneratedValue()
    @Column(name = "ID")
    private String id;
    @Column(name = "NAME")
    private String lastname;
    @Column(name = "FIRSTNAME")
    private String firstname;
    @Column(name = "PROFILE")
    private Profil profil;
    @Column(name = "EMAIL")
    private String linkEmail;
    @Column(name = "PHONE_NUMBER")
    private String linkPhoneNumber;
    @Column(name = "NUMBER")
    private int linkNumber;
    @Column(name = "STREET")
    private String linkSreet;
    @Column(name = "POSTAL_CODE")
    private int linkPostalCode;
    @Column(name = "CITY")
    private String linkCity;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "BASKET_ID", referencedColumnName = "ID")
    private BasketJPA basket;
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name="CUSTOMER_ID", referencedColumnName = "ID")
    private List<RelativeJPA> relatives = new ArrayList<>() ;

    //Constructors
    public CustomerJPA(){}

    public CustomerJPA(Customer customer) {
        this.id = customer.getId();
        this.lastname = customer.getLastname();
        this.firstname = customer.getFirstname();
        this.profil = customer.getProfil();
        this.linkEmail = customer.getLink().getEmail();
        this.linkPhoneNumber = customer.getLink().getPhoneNumber();
        this.linkNumber = customer.getLink().getAdress().getNumber();
        this.linkSreet = customer.getLink().getAdress().getStreet();
        this.linkPostalCode = customer.getLink().getAdress().getPostalCode();
        this.linkCity = customer.getLink().getAdress().getCity();
     //   this.basket = customer.getBasket();
        this.relatives = customer.getRelatives()
                .stream()
                .map(RelativeJPA::new)
                .collect(Collectors.toList());
    }

    //Getter
    public String getId() {return id;}
    public String getLastname() {return lastname;}
    public String getFirstname() {return firstname;}
    public Profil getProfil() {return profil;}
    public String getLinkEmail() {return linkEmail;}
    public String getLinkPhoneNumber() { return linkPhoneNumber;}
    public int geLinktNumber() { return linkNumber;}
    public String getLinkStreet() {return linkSreet;}
    public int getLinkPostalCode() {return linkPostalCode;}
    public String getLinkCity() {return linkCity;}
    public BasketJPA getBasket() {return basket;}
    public List<RelativeJPA> getRelatives() { return relatives;}
}
