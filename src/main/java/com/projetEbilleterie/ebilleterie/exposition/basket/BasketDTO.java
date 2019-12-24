package com.projetEbilleterie.ebilleterie.exposition.basket;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.projetEbilleterie.ebilleterie.exposition.eticket.EticketDTO;
import java.util.List;

public class BasketDTO {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    String id;
    @JsonProperty
    Integer quantity;
    @JsonProperty
    Boolean status;
    @JsonProperty
    List<EticketDTO> etickets ;

    //Constructors
    public BasketDTO(){}

    BasketDTO(String id, int quantity, boolean status, List<EticketDTO> etickets) {
        this.id = id;
        this.quantity = quantity;
        this.status = status;
        this.etickets = etickets;
    }

    //Getter
    public String getId() {return id;}
    public Integer getQuantity() { return quantity;}
    public Boolean isStatus() { return status;}
    public List<EticketDTO> getEtickets() {return etickets;}
}
