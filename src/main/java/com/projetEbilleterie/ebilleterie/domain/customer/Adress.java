package com.projetEbilleterie.ebilleterie.domain.customer;

import java.util.Objects;

public class Adress {
    // Attributs
    private int number;
    private String street;
    private int postalCode;
    private String city;
    // Constructors
    public Adress() {}

    public Adress(int number, String street, int postalCode, String city) {
        this.number = number;
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
    }

    //Accesseurs
    public int getNumber() {
        return number;
    }
    public String getStreet() {
        return street;
    }
    public int getPostalCode() {
        return postalCode;
    }
    public String getCity() {
        return city;
    }

    // Méthode primales
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return number == adress.number &&
                postalCode == adress.postalCode &&
                street.equals(adress.street) &&
                city.equals(adress.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, street, postalCode, city);
    }
}

