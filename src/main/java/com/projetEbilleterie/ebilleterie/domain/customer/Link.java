package com.projetEbilleterie.ebilleterie.domain.customer;

import java.util.ArrayList;
import java.util.List;

public class Link {
    // Attributs
    private String email;
    private List<String> phoneNumber = new ArrayList<>();
    private Adress adress;

    //Cosntructors
    public Link() {};

    public Link(String email, List<String> phoneNumber, Adress adress) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
    }

    //Getter
    public String getEmail() { return email; }
    public List<String> getPhoneNumber() { return phoneNumber; }
    public Adress getAdress() {return adress; }

    //Méthodes primales
    @Override
    public String toString() {
        return "Link{" +
                "email='" + email + '\'' +
                '}';
    }
}
