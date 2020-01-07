package com.projetEbilleterie.ebilleterie.exposition.basket2;

import com.projetEbilleterie.ebilleterie.application.Basket2Service;
import com.projetEbilleterie.ebilleterie.application.CustomerService;
import com.projetEbilleterie.ebilleterie.application.RelativeService;
import com.projetEbilleterie.ebilleterie.domain.basket.Basket;
import com.projetEbilleterie.ebilleterie.domain.basket2.Basket2;
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

  //  @CrossOrigin
 //   @RequestMapping(method = RequestMethod.GET, path = {"/basket2s"})
 //   public List<Basket2DTO> listAllBaskets2() {
 //       return Basket2Adapter.adaptToBasket2DTOList(this.basket2Service.listAllBasket2s());
 //   }

    @RequestMapping(method = RequestMethod.GET, path = {"/customers/{customerId}/basket2s"})
    public List<Basket2DTO> listAllBasket2sFromCustomer(@PathVariable("customerId") Long customerId) {
        List<Basket2> basket2s = this.basket2Service.listAllBasket2s(customerId);
        return Basket2Adapter.adaptToBasket2DTOList(basket2s);
    }

 //   @RequestMapping(method = RequestMethod.POST, path = {"/customers/{customerId}/basket2"})
 //   @ResponseStatus(HttpStatus.CREATED)
 //   public void addBasket2ToCustomer(@PathVariable("customerId") Long customerId, @RequestBody Basket2DTO basket2DTO) {
 //       this.basket2Service.addBasket2(customerId, Basket2Adapter.transformToBasket2(basket2DTO));
 //   }


}
