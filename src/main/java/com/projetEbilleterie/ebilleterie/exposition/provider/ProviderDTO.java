package com.projetEbilleterie.ebilleterie.exposition.provider;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.projetEbilleterie.ebilleterie.domain.eticket.Eticket;
import com.projetEbilleterie.ebilleterie.domain.provider.Category;
import java.util.List;

public class ProviderDTO {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    String id;
    @JsonProperty
    String name;
    @JsonProperty
    Category category;
    @JsonProperty
    List<Eticket> etickets ;

    //Constructors
    public ProviderDTO(){};

    public ProviderDTO(String id, String name, Category category, List<Eticket> etickets) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.etickets = etickets;
    }

    //Getter
    public String getId() {return id;}
    public String getName() {return name;}
    public Category getCategory() {return category;}
    public List<Eticket> getEtickets() {return etickets;}
}
