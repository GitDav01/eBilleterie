package com.projetEbilleterie.ebilleterie.domain.customer;

import com.projetEbilleterie.ebilleterie.domain.basket.Basket;
import com.projetEbilleterie.ebilleterie.domain.exception.ErrorCodes;
import com.projetEbilleterie.ebilleterie.domain.exception.MyAppTicketException;
import com.projetEbilleterie.ebilleterie.domain.relative.Relative;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    // Attributs
    private Long id;
    private String lastname;
    private String firstname;
    private Profil profil;
    private String email;
    private String phoneNumber;
    private Adress adress ;
    private List<Relative> relatives = new ArrayList<>();
    private String password;
    private List<Basket> baskets = new ArrayList<>();

    // Constructors
    public Customer(){}
    public Customer(Long id, String lastname, String firstname, Profil profil,
                    String email, String phoneNumber, Adress adress, List<Relative> relatives,String password,
                    List<Basket> baskets) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.profil = profil;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
        this.relatives = relatives;
        this.password = password;
        this.baskets = baskets;
    }

    public void update(Customer customerWithNewInformation) {
        this.lastname = customerWithNewInformation.getLastname();
        this.firstname = customerWithNewInformation.getFirstname();
        this.profil = customerWithNewInformation.getProfil();
        this.email = customerWithNewInformation.getEmail();
        this.phoneNumber = customerWithNewInformation.getPhoneNumber();
        this.adress = customerWithNewInformation.getAdress();
        this.relatives = customerWithNewInformation.getRelatives();
        this.password = customerWithNewInformation.getPassword();
        this.baskets =  customerWithNewInformation.getBaskets();
    //    validate();
    }

    // Méthode liées aux Relatives

    private Relative searchRelative(Long relativeId) {
        Relative relative = this.relatives.stream()
                .filter(l -> l.getId().equals(relativeId))
                .findFirst().orElseThrow(() -> new MyAppTicketException(ErrorCodes.RELATIVE_NOT_FOUND));
        return relative;
    }
    public void addRelative(Relative relative) {
        this.getRelatives().add(relative);
    }

    public void removeRelative(Long relativeId) {
        Relative relative = searchRelative(relativeId);
        this.relatives.remove(relative);
    }

    public void updateRelative(Long relativeId, Relative relativeWithNewInformation) {
        Relative relative = searchRelative(relativeId);
        relative.update(relativeWithNewInformation);
    }

    // Getter
    public Long getId() { return id;}
    public String getLastname() {return lastname; }
    public String getFirstname() { return firstname; }
    public Profil getProfil() {return profil;}
    public String getEmail() {return email; }
    public String getPhoneNumber() {return phoneNumber; }
    public Adress getAdress () {return adress;}
    public List<Relative> getRelatives() {return relatives;}
    public String getPassword() {return password;}
    public List<Basket> getBaskets() {return baskets ;}

    // Methode equals, hashcode et to string, notement pour les test d'equals sur l'Id
    //--------------------------------------------------------------------------------
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



