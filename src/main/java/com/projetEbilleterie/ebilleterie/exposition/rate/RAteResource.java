package com.projetEbilleterie.ebilleterie.exposition.rate;

import com.projetEbilleterie.ebilleterie.application.Eticket2Service;
import com.projetEbilleterie.ebilleterie.application.RateService;
import com.projetEbilleterie.ebilleterie.domain.rate.Rate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RAteResource {

    @Autowired
    RateService rateservice;
    @Autowired
    Eticket2Service eticket2Service;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, path = {"/rates"})
    public List<RateDTO> listAllRates() {
        return RateAdapter.adaptToRateDTOList(this.rateservice.listAllRate());
    }
    @RequestMapping(method = RequestMethod.GET, path = {"/etickets/{eticketId}/rates"})
    public List<RateDTO> listAllRatesFromEticket(@PathVariable("eticketId") String eticketId) {
        List<Rate> rates = this.eticket2Service.listAllRates(eticketId);
        return RateAdapter.adaptToRateDTOList(rates);
    }
}
