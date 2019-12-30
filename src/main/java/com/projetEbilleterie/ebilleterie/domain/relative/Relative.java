package com.projetEbilleterie.ebilleterie.domain.relative;

public class Relative {
    //Attributs
    private String id;
    private String lastname;
    private String firstname;
    private String email;
    private String phoneNumber;


    // Constructors
    public Relative() {}

    public Relative(String id, String lastname, String firstname, String email, String phoneNumber) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.phoneNumber=phoneNumber;
        }

    //Getter
    public String getId() {return id; }
    public String getLastname() { return lastname; }
    public String getFirstname() {return firstname; }
    public String getEmail() {return email; }
    public String getPhoneNumber() {return phoneNumber; }

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
