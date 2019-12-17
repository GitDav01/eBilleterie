package com.projetEbilleterie.ebilleterie.domain.provider;

import com.projetEbilleterie.ebilleterie.domain.eticket.Eticket;

import java.util.ArrayList;
import java.util.List;

public class Provider {
    //Attributs
    private String id;
    private String name;
    private Category category;
    private List<Eticket> etickets = new ArrayList<>();

    //Cosntructors
    public Provider() {}
    public Provider(String id, String name, Category category,
                    List<Eticket> etickets) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.etickets = etickets;
    }

    //Getter
    public String getId() {return id;}
    public String getName() {return name; }
    public Category getCategory() {return category; }
    public List<Eticket> getEtickets() { return etickets; }

    // Methode equals, hashcode et to string, notement pour les test d'equals sur l'Id

    @Override public boolean equals(Object obj) {
        if(obj == null) {return false; }
        if(!this.getClass().isAssignableFrom(obj.getClass())) {return false; }
        Provider that = this.getClass().cast(obj);
        return that.id.equals(this.id);
    }

    @Override public int hashCode() {
        return this.id.hashCode();
    }

    @Override public String toString() {
        return String.format("%s{id:%s)", this.getClass().getSimpleName(), id);
    }


}


