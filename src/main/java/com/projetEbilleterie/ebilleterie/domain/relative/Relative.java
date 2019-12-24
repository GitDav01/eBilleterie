package com.projetEbilleterie.ebilleterie.domain.relative;

import com.projetEbilleterie.ebilleterie.domain.customer.Customer;
import com.projetEbilleterie.ebilleterie.domain.customer.Link;

public class Relative {
    //Attributs
    private String id;
    private String lastname;
    private String firstname;
    private Link link;
    private Customer customer;

    // Constructors
    public Relative() {}

    public Relative(String id, String lastname, String firstname, Link link,Customer customer) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.link = link;
        this.customer = customer;
    }

    //Getter
    public String getId() {return id; }
    public String getLastname() { return lastname; }
    public String getFirstname() {return firstname; }
    public Link getLink() {return link; }
    public Customer getCustomer() {return customer; }

    // Methode equals, hashcode et to string, notement pour les test d'equals sur l'Id

    @Override public boolean equals(Object obj) {
        if(obj == null) {return false; }
        if(!this.getClass().isAssignableFrom(obj.getClass())) {return false; }
        Relative that = this.getClass().cast(obj);
        return that.id.equals(this.id);
    }

    @Override public int hashCode() {
        return this.id.hashCode();
    }

    @Override public String toString() {
        return String.format("%s{id:%s)", this.getClass().getSimpleName(), id);
    }
}
