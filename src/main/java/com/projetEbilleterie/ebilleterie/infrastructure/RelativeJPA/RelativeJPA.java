package com.projetEbilleterie.ebilleterie.infrastructure.RelativeJPA;

import com.projetEbilleterie.ebilleterie.domain.relative.Relative;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "RELATIVE")
public class RelativeJPA {

    @Id
    //@GeneratedValue()
    @Column(name = "ID")
    private String id;
    @Column(name = "LASTNAME")
    private String lastname;
    @Column(name = "FIRSTNAME")
    private String firstname;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    @Column(name = "NUMBER")
    private int number;
    @Column(name = "STREET")
    private String street;
    @Column(name = "POSTAL_CODE")
    private int postalCode;
    @Column(name = "CITY")
    private String city;


    //Constructors
    public RelativeJPA(){}

    public RelativeJPA(Relative relative) {
        this.id = relative.getId();
        this.lastname = relative.getLastname();
        this.firstname = relative.getFirstname();
        this.email = relative.getLink().getEmail();
        this.phoneNumber = relative.getLink().getPhoneNumber();
        this.number = relative.getLink().getAdress().getNumber();
        this.street = relative.getLink().getAdress().getStreet();
        this.postalCode = relative.getLink().getAdress().getPostalCode();
        this.city = relative.getLink().getAdress().getCity();
    }

    // Getter
    public String getId() {return id;}
    public String getLastname() {return lastname;  }
    public String getFirstname() {return firstname;}
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
    public int getNumber() {return number;}
    public String getStreet() {return street; }
    public int getPostalCode() {return postalCode;}
    public String getCity() {return city; }
}
