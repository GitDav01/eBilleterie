package com.projetEbilleterie.ebilleterie.exposition.relative;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.projetEbilleterie.ebilleterie.domain.customer.Customer;

public class RelativeDTO {
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    String id;
    @JsonProperty
    String lastname;
    @JsonProperty
    String firstname;
    @JsonProperty
    String email;
    @JsonProperty
    String phoneNumber;

    //constructors
    public RelativeDTO() {}

    public RelativeDTO(String id, String lastname, String firstname, String email, String phoneNumber) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.phoneNumber = phoneNumber;
     }

    // Getter
    public String getId() {return id; }
    public String getLastname() {return lastname;}
    public String getFirstname() {return firstname;}
    public String getEmail() {return email;}
    public String getPhoneNumber() {return phoneNumber;}

}
