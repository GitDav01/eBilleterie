package com.projetEbilleterie.ebilleterie.exposition.eticket2;


import com.projetEbilleterie.ebilleterie.application.Eticket2Service;
import com.projetEbilleterie.ebilleterie.domain.eticket2.TypePrice;
import com.projetEbilleterie.ebilleterie.domain.rate.Rate;
import com.projetEbilleterie.ebilleterie.exposition.rate.RateAdapter;
import com.projetEbilleterie.ebilleterie.exposition.rate.RateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class Eticket2Resource {

    @Autowired
    Eticket2Service eticket2Service;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST, path = {"/eticket2"})
    @ResponseStatus(HttpStatus.CREATED)
    public void createEticket2(@Valid @RequestBody Eticket2DTO eticket2DTO) {
        this.eticket2Service.createEticket(Eticket2Adapter.transformToEticket(eticket2DTO));
    }
    @RequestMapping(method = RequestMethod.GET, path = {"/etickets2/{eticketId}"})
    public Eticket2DTO detailEticket2(@PathVariable("eticketId") Long eticketId) {
        return Eticket2Adapter.adaptToEticketDTO(this.eticket2Service.obtainEticket(eticketId));
    }
    @RequestMapping(method = RequestMethod.GET, path = {"/etickets2"})
    public List<Eticket2DTO> listAllEtickets2() {
        return Eticket2Adapter.adaptToEticket2DTOList(this.eticket2Service.listAllEticket());
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/etickets/{eticketId}/rates"})
    public List<RateDTO> listAllRatesFromEticket(@PathVariable("eticketId") Long eticketId) {
        List<Rate> rates = this.eticket2Service.listAllRates(eticketId);
        return RateAdapter.adaptToRateDTOList(rates);
    }

    @RequestMapping(method = RequestMethod.PUT, path = {"/etickets/{eticketId}/rates/{typePrice}"})
    public void updateRate(@PathVariable("eticketId") Long eticketId, @PathVariable("typePrice") TypePrice typePrice,
                               @RequestBody Eticket2DTO.RateDTO rateDTO) {
        this.eticket2Service.updateRate(eticketId, typePrice, Eticket2Adapter.transformToRate(rateDTO));
    }
}
