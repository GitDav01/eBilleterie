package com.projetEbilleterie.ebilleterie.exposition.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.projetEbilleterie.ebilleterie.domain.basket.Basket;
import com.projetEbilleterie.ebilleterie.domain.customer.Link;
import com.projetEbilleterie.ebilleterie.domain.customer.Profil;
import com.projetEbilleterie.ebilleterie.domain.relative.Relative;

import java.util.List;

public class CustomerDTO {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    String id;
    @JsonProperty
    String lastname;
    @JsonProperty
    String firstname;
    @JsonProperty
    Profil profil;
    @JsonProperty
    Link link;
    @JsonProperty
    Basket basket;
    @JsonProperty
    List<Relative> relatives;

    //Constructors
    public CustomerDTO() {}

    public CustomerDTO(String id, String lastname, String firstname, Profil profil, Link link,
                       Basket basket, List<Relative> relatives) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.profil = profil;
        this.link = link;
        this.basket = basket;
        this.relatives = relatives;
    }

    // Getter
    public String getId() {return id;}
    public String getLastname() {return lastname;}
    public String getFirstname() {return firstname;}
    public Profil getProfil() {return profil;}
    public Link getLink() {return link;}
    public Basket getBasket() {return basket;}
    public List<Relative> getRelatives() {return relatives;}
}
