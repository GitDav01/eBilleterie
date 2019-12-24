package com.projetEbilleterie.ebilleterie.domain.customer;

import java.util.ArrayList;
import java.util.List;

public class Link {
    // Attributs
    private String email;
    private String phoneNumber;
    private Adress adress;

    //Cosntructors
    public Link() {}

    public Link(String email, String phoneNumber, Adress adress) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
    }

    //Getter
    public String getEmail() { return email; }
    public String getPhoneNumber() {return phoneNumber;}
    public Adress getAdress() {return adress;}

    //Méthodes primales
    @Override
    public String toString() {
        return "Link{" +
                "email='" + email + '\'' +
                '}';
    }
}
