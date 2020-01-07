package com.projetEbilleterie.ebilleterie.infrastructure.customerJPA;

import com.projetEbilleterie.ebilleterie.domain.basket2.Basket2;
import com.projetEbilleterie.ebilleterie.domain.customer.Adress;
import com.projetEbilleterie.ebilleterie.domain.customer.Customer;
import com.projetEbilleterie.ebilleterie.domain.customer.Profil;
import com.projetEbilleterie.ebilleterie.domain.eticket2.Eticket2;
import com.projetEbilleterie.ebilleterie.domain.relative.Relative;
import com.projetEbilleterie.ebilleterie.infrastructure.RelativeJPA.RelativeJPA;
import com.projetEbilleterie.ebilleterie.infrastructure.basket2JPA.Basket2JPA;
import com.projetEbilleterie.ebilleterie.infrastructure.eticket2JPA.Eticket2JPA;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity(name = "CUSTOMER")
public class CustomerJPA {

    @Id
    @GeneratedValue()
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    private String lastname;
    @Column(name = "FIRSTNAME")
    private String firstname;
    @Enumerated(EnumType.STRING)
    @Column(name = "PROFILE")
    private Profil profil;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    @Column(name = "ADDRESS_NUMBER")
    private int adressNumber;
    @Column(name = "ADDRESS_STREET")
    private String adressSreet;
    @Column(name = "ADDRESS_POSTAL_CODE")
    private int adressPostalCode;
    @Column(name = "ADDRESS_CITY")
    private String adressCity;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="CUSTOMER_ID", referencedColumnName = "ID")
    private List<RelativeJPA> relatives = new ArrayList<>() ;
    @Column(name = "PASSWORD")
    private String password;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID")
    private List<Basket2JPA> basket2s = new ArrayList<>() ;

    //Constructors
    public CustomerJPA(){}

    CustomerJPA(Customer customer) {
        this.id = customer.getId();
        this.lastname = customer.getLastname();
        this.firstname = customer.getFirstname();
        this.profil = customer.getProfil();
        this.email = customer.getEmail();
        this.phoneNumber = customer.getPhoneNumber();
        this.adressNumber = customer.getAdress().getNumber();
        this.adressSreet = customer.getAdress().getStreet();
        this.adressPostalCode = customer.getAdress().getPostalCode();
        this.adressCity = customer.getAdress().getCity();
        this.relatives = customer.getRelatives()
                        .stream()
                        .map(RelativeJPA::new)
                        .collect(Collectors.toList());
        this.password = customer.getPassword();
        this.basket2s = customer.getBasket2s()
                    .stream()
                    .map(Basket2JPA::new)
                    .collect(Collectors.toList());
    }

    //Adapter JPA
    Customer toCustomer() {
        List<Relative> relativeList = relatives.stream()
                .map(b -> new Relative(b.getId(),b.getLastname(),b.getFirstname(),b.getEmail(),b.getPhoneNumber()))
                .collect(Collectors.toList());
        List<Basket2> basket2List = basket2s.stream()
                .map(c -> new Basket2(c.getId(),c.getQuantity(),c.isStatus(),c.getCategory(),
                        c.getReference(),c.getPrice(),c.getTypePrice(),c.getPurchaseDate()))
                .collect(Collectors.toList());
        Adress adress = new Adress(adressNumber, adressSreet, adressPostalCode, adressCity);
        return new Customer(id, this.lastname,this.firstname,this.profil,this.email,
                            this.phoneNumber,adress,relativeList,password ,basket2List);
    }


    //Getter
    public Long getId() {return id;}
    public String getLastname() {return lastname;}
    public String getFirstname() {return firstname;}
    public Profil getProfil() {return profil;}
    public String getEmail() {return email;}
    public String getPhoneNumber() { return phoneNumber;}
    public int getAdressNumber() { return adressNumber;}
    public String getAdressStreet() {return adressSreet;}
    public int getAdressPostalCode() {return adressPostalCode;}
    public String getAadressCity() {return adressCity;}
    public List<RelativeJPA> getRelatives() { return relatives;}
    public String getPassword() {return password;}
    public List<Basket2JPA> getBasket2s() {return basket2s;}
}
