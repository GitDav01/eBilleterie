package com.projetEbilleterie.ebilleterie.domain.customer;

import com.projetEbilleterie.ebilleterie.domain.basket.Basket;
import com.projetEbilleterie.ebilleterie.domain.relative.Relative;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    // Attributs
    private String id;
    private String lastname;
    private String firstname;
    private Profil profil;
    private Link link;
    private Basket basket;
    private List<Relative> relatives = new ArrayList<>();

    // Constructors
    public Customer(){}
    public Customer(String id, String lastname, String firstname, Profil profil,
                    Link link, Basket basket, List<Relative> relatives) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.profil = profil;
        this.link = link;
        this.basket = basket;
        this.relatives = relatives;
    }

    // Getter
    public String getId() { return id;}
    public String getLastname() {return lastname; }
    public String getFirstname() { return firstname; }
    public Profil getProfil() {return profil;}
    public Link getLink() {return link; }
    public Basket getBasket() {return basket;}
    public List<Relative> getRelatives() {return relatives;}

// Methode equals, hashcode et to string, notement pour les test d'equals sur l'Id

    @Override public boolean equals(Object obj) {
        if(obj == null) {return false; }
        if(!this.getClass().isAssignableFrom(obj.getClass())) {return false; }
        Customer that = this.getClass().cast(obj);
        return that.id.equals(this.id);
    }

    @Override public int hashCode() {
        return this.id.hashCode();
    }

    @Override public String toString() {
        return String.format("%s{id:%s)", this.getClass().getSimpleName(), id);
    }

}



