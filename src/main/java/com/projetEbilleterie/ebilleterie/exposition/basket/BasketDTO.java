package com.projetEbilleterie.ebilleterie.exposition.basket;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.projetEbilleterie.ebilleterie.exposition.eticket.EticketDTO;
import java.util.List;

public class BasketDTO {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    Long id;
    @JsonProperty
    int quantity;
    @JsonProperty
    boolean status;
  //  @JsonProperty
  //  List<EticketDTO> etickets ;

    //Constructors
    public BasketDTO(){}

    BasketDTO(Long id, int quantity, boolean status/*, List<EticketDTO> etickets*/) {
        this.id = id;
        this.quantity = quantity;
        this.status = status;
   //     this.etickets = etickets;
    }

    //Getter
    public Long getId() {return id;}
    public int getQuantity() { return quantity;}
    public boolean isStatus() { return status;}
 //   public List<EticketDTO> getEtickets() {return etickets;}
}
