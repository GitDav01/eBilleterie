package com.projetEbilleterie.ebilleterie.exposition.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.projetEbilleterie.ebilleterie.domain.basket.Basket;
import com.projetEbilleterie.ebilleterie.domain.customer.Adress;
import com.projetEbilleterie.ebilleterie.domain.customer.Profil;
import com.projetEbilleterie.ebilleterie.domain.relative.Relative;
import com.projetEbilleterie.ebilleterie.exposition.basket.BasketDTO;
import com.projetEbilleterie.ebilleterie.exposition.basket2.Basket2DTO;
import com.projetEbilleterie.ebilleterie.exposition.relative.RelativeDTO;

import java.util.List;

public class CustomerDTO {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    Long id;
    @JsonProperty
    String lastname;
    @JsonProperty
    String firstname;
    @JsonProperty
    Profil profil;
    @JsonProperty
    String email;
    @JsonProperty
    String phoneNumber;
    @JsonProperty
    Adress adress;
    @JsonProperty
    List<RelativeDTO> relatives;
    @JsonProperty
    String password;
    @JsonProperty
    List<Basket2DTO> basket2s;

    //Constructors
    public CustomerDTO() {}

    public CustomerDTO(Long id, String lastname, String firstname, Profil profil, String email,
                       String phoneNumber, Adress adress, List<RelativeDTO> relatives,String password
                        , List<Basket2DTO> basket2s) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.profil = profil;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
        this.relatives = relatives;
        this.password = password;
        this.basket2s = basket2s;
    }

    // Getter
    public Long getId() {return id;}
    public String getLastname() {return lastname;}
    public String getFirstname() {return firstname;}
    public Profil getProfil() {return profil;}
    public String getemail() {return email;}
    public String getPhoneNumber() {return phoneNumber;}
    public Adress getAdress() {return adress;}
    public List<RelativeDTO> getRelatives() {return relatives;}
    public String getPassword() {return password;}
     public List<Basket2DTO> getBasket2s() {return basket2s;}
}
