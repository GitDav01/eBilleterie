package com.projetEbilleterie.ebilleterie.domain.customer;

public class Relative {
    //Attributs
    private String id;
    private String lastname;
    private String firstname;
    private Link link;

    // Constructors
    public Relative() {};

    public Relative(String id, String lastname, String firstname, Link link) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.link = link;
    }

    //Getter
    public String getId() {return id; }
    public String getLastname() { return lastname; }
    public String getFirstname() {return firstname; }
    public Link getLink() {return link; }

    //Methodes primales
    @Override
    public String toString() {
        return "Relative{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                '}';
    }
}
