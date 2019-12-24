package com.projetEbilleterie.ebilleterie.exposition.provider;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.projetEbilleterie.ebilleterie.domain.provider.Category;

public class ProviderDTO {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    String id;
    @JsonProperty
    String name;
    @JsonProperty
    Category category;

    //Constructors
    public ProviderDTO(){}

    ProviderDTO(String id, String name, Category category) {
        this.id = id;
        this.name = name;
        this.category = category;
       }

    //Getter
    public String getId() {return id;}
    public String getName() {return name;}
    public Category getCategory() {return category;}
   }
