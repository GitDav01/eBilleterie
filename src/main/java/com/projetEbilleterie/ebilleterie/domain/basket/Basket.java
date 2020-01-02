package com.projetEbilleterie.ebilleterie.domain.basket;

import com.projetEbilleterie.ebilleterie.domain.customer.Customer;
import com.projetEbilleterie.ebilleterie.domain.eticket.Eticket;
import com.projetEbilleterie.ebilleterie.domain.provider.Provider;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    // Attributs
    private Long id;
    private int quantity;
    private boolean status;
    //private List<Eticket> etickets = new ArrayList<>();

    //Constructors
    public Basket(){}
    public Basket(Long id, int quantity, boolean status/*,
                  List<Eticket> etickets*/) {
        this.id = id;
        this.quantity = quantity;
        this.status = status;
     //   this.etickets = etickets;
    }

    //Getter
    public Long getId() {return id; }
    public int getQuantity() {return quantity; }
    public boolean isStatus() {return status;}
  //  public List<Eticket> getEtickets() {return etickets;}

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
