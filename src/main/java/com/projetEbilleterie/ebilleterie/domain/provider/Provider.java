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
    public Provider() {};
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
}
