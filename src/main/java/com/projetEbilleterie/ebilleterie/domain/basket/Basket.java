package com.projetEbilleterie.ebilleterie.domain.basket;

import com.projetEbilleterie.ebilleterie.domain.eticket.Eticket;
import com.projetEbilleterie.ebilleterie.domain.provider.Provider;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    // Attributs
    private String id;
    private Integer quantity;
    private Boolean status;
    private List<Eticket> etickets = new ArrayList<>();

    //Constructors
    public Basket(){}
    public Basket(String id, Integer quantity, Boolean status,
                  List<Eticket> etickets) {
        this.id = id;
        this.quantity = quantity;
        this.status = status;
        this.etickets = etickets;
    }

    //Getter
    public String getId() {return id; }
    public Integer getQuantity() {return quantity; }
    public Boolean isStatus() {return status;}
    public List<Eticket> getEtickets() {return etickets;}

    // Methode equals, hashcode et to string, notement pour les test d'equals sur l'Id

    @Override public boolean equals(Object obj) {
        if(obj == null) {return false; }
        if(!this.getClass().isAssignableFrom(obj.getClass())) {return false; }
        Basket that = this.getClass().cast(obj);
        return that.id.equals(this.id);
    }

    @Override public int hashCode() {
        return this.id.hashCode();
    }

    @Override public String toString() {
        return String.format("%s{id:%s)", this.getClass().getSimpleName(), id);
    }
}
