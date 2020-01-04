package com.projetEbilleterie.ebilleterie.exposition.basket2;

import com.projetEbilleterie.ebilleterie.application.Basket2Service;
import com.projetEbilleterie.ebilleterie.application.CustomerService;
import com.projetEbilleterie.ebilleterie.application.RelativeService;
import com.projetEbilleterie.ebilleterie.domain.relative.Relative;
import com.projetEbilleterie.ebilleterie.exposition.relative.RelativeAdapter;
import com.projetEbilleterie.ebilleterie.exposition.relative.RelativeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Basket2Resource {

    @Autowired
    Basket2Service basket2Service;



 //   @RequestMapping(method = RequestMethod.GET, path = {"/relatives/{relativeId}"})
 //   public RelativeDTO detailRelative(@PathVariable("relativeId") String relativeId) {
 //       return RelativeAdapter.adaptToRelativeDTO(this.relativeService.obtainRelative(relativeId));
  //  }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, path = {"/basket2s"})
    public List<Basket2DTO> listAllBaskets2() {
        return Basket2Adapter.adaptToBasket2DTOList(this.basket2Service.listAllBasket2());
    }

 //   @RequestMapping(method = RequestMethod.GET, path = {"/customers/{customerId}/relatives"})
 //   public List<RelativeDTO> listAllRelativesFromCustomer(@PathVariable("customerId") Long customerId) {
 //       List<Relative> relatives = this.customerService.listAllRelatives(customerId);
 //       return RelativeAdapter.adaptToRelativeDTOList(relatives);
 //   }


}
