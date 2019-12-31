package com.projetEbilleterie.ebilleterie.infrastructure.RelativeJPA;

import com.projetEbilleterie.ebilleterie.domain.basket.Basket;
import com.projetEbilleterie.ebilleterie.domain.eticket.Eticket;
import com.projetEbilleterie.ebilleterie.domain.relative.Relative;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;
import java.util.stream.Collectors;

@Entity(name = "RELATIVE")
public class RelativeJPA {

    @Id
    @GeneratedValue()
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


    //Constructors
    public RelativeJPA(){}

    public RelativeJPA(Relative relative) {
        this.id = relative.getId();
        this.lastname = relative.getLastname();
        this.firstname = relative.getFirstname();
        this.email = relative.getEmail();
        this.phoneNumber = relative.getPhoneNumber();
      }

    //Adapter JPA
    Relative toRelative() {
        return new Relative(id, this.lastname, this.firstname, this.email, this.phoneNumber);
    }

    // Getter
    public String getId() {return id;}
    public String getLastname() {return lastname;  }
    public String getFirstname() {return firstname;}
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }

}
