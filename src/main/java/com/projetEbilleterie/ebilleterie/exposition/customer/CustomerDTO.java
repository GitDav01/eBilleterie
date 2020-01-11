package com.projetEbilleterie.ebilleterie.exposition.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.projetEbilleterie.ebilleterie.domain.customer.Adress;
import com.projetEbilleterie.ebilleterie.domain.customer.Profil;
import com.projetEbilleterie.ebilleterie.domain.eticket2.Category;
import com.projetEbilleterie.ebilleterie.domain.eticket2.TypePrice;

import java.util.Date;
import java.util.List;

public class CustomerDTO {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    Long id;
    @JsonProperty String lastname;
    @JsonProperty String firstname;
    @JsonProperty Profil profil;
    @JsonProperty String email;
    @JsonProperty String phoneNumber;
    @JsonProperty Adress adress;
    @JsonProperty List<RelativeDTO> relatives;
    @JsonProperty String password;
    @JsonProperty List<Basket2DTO> basket2s;

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

     // Objets enfants
    //----------------
    // 1 - RELATIVE
    public static class RelativeDTO {
        //    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
        //   Long id;
        @JsonProperty  String lastname;
        @JsonProperty  String firstname;
        @JsonProperty  String email;
        @JsonProperty  String phoneNumber;

        //constructors
        public RelativeDTO() {}

        public RelativeDTO(/*Long id,*/ String lastname, String firstname, String email, String phoneNumber) {
            //    this.id = id;
            this.lastname = lastname;
            this.firstname = firstname;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

        // Getter
        //   public Long getId() {return id; }
        public String getLastname() {return lastname;}
        public String getFirstname() {return firstname;}
        public String getEmail() {return email;}
        public String getPhoneNumber() {return phoneNumber;}
    }

    // 2 - BASKET
    public static class Basket2DTO {

        //   @JsonProperty(access = JsonProperty.Access.READ_ONLY)
        //   Long id;
        @JsonProperty int quantity;
        @JsonProperty boolean status;
        @JsonProperty Category category;
        @JsonProperty String reference;
        @JsonProperty double price;
        @JsonProperty TypePrice typePrice;
        @JsonProperty Date purchaseDate;
        @JsonProperty String relativeName;

        //Constructors
        public Basket2DTO(){}

        public Basket2DTO(/*Long id, */ int quantity, boolean status, Category category, String reference,
                                        double price, TypePrice typePrice, Date purchaseDate, String relativeName) {
            //   this.id = id;
            this.quantity = quantity;
            this.status = status;
            this.category = category;
            this.reference = reference;
            this.price = price;
            this.typePrice = typePrice;
            this.purchaseDate = purchaseDate;
            this.relativeName = relativeName;
        }

        //Getter
        //   public Long getId() {return id;}
        public int getQuantity() { return quantity;}
        public boolean isStatus() { return status;}
        public Category getCategory() {return category;}
        public String getReference() {return reference;}
        public double getPrice() {return price;}
        public TypePrice getTypePrice() {return typePrice;}
        public Date getPurchaseDate() {return purchaseDate;}
        public String getRelativeName() {return relativeName;}
    }

}
