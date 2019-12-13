package com.projetEbilleterie.ebilleterie.domain.basket;

import com.projetEbilleterie.ebilleterie.domain.eticket.Eticket;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    // Attributs
    private String id;
    private int quantity;
    private boolean status;
    private List<Eticket> etickets = new ArrayList<>();

    //Constructors
    public Basket(String id, int quantity, boolean status,
                  List<Eticket> etickets) {
        this.id = id;
        this.quantity = quantity;
        this.status = status;
        this.etickets = etickets;
    }

    //Getter
    public String getId() {return id; }
    public int getQuantity() {return quantity; }
    public boolean isStatus() {return status;}
    public List<Eticket> getEtickets() {return etickets;}
}
