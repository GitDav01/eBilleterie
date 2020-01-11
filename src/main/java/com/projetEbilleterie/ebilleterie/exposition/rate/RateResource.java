package com.projetEbilleterie.ebilleterie.exposition.rate;

import com.projetEbilleterie.ebilleterie.application.Eticket2Service;
import com.projetEbilleterie.ebilleterie.application.RateService;
import com.projetEbilleterie.ebilleterie.domain.eticket2.TypePrice;
import com.projetEbilleterie.ebilleterie.domain.rate.Rate;
import com.projetEbilleterie.ebilleterie.exposition.eticket2.Eticket2DTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RateResource {

 //   @Autowired
 //   RateService rateservice;
//    @Autowired
//    Eticket2Service eticket2Service;

 //   @CrossOrigin
 //   @RequestMapping(method = RequestMethod.GET, path = {"/rates"})
 //   public List<RateDTO> listAllRates() {
 //       return RateAdapter.adaptToRateDTOList(this.rateservice.listAllRate());
 //   }

 //   @RequestMapping(method = RequestMethod.GET, path = {"/etickets/{eticketId}/rates"})
 //   public List<RateDTO> listAllRatesFromEticket(@PathVariable("eticketId") Long eticketId) {
 //       List<Rate> rates = this.eticket2Service.listAllRates(eticketId);
 //       return RateAdapter.adaptToRateDTOList(rates);
 //   }
//    @RequestMapping(method = RequestMethod.PUT, path = {"/etickets/{eticketId}/rates/{typePrice}/stock/{quantity}"})
//    public void updateStockRateQuery(@PathVariable("eticketId") Long eticketId, @PathVariable("typePrice") TypePrice typePrice,
//                                     @PathVariable("quantity") int quantity,  @RequestBody Eticket2DTO eticketDTO)
//    {
//        this.eticket2Service.updateStockRateQuery(quantity, eticketId, typePrice);
//    }
}
