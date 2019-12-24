package com.projetEbilleterie.ebilleterie.exposition.eticket;

import com.projetEbilleterie.ebilleterie.application.EticketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EticketResource {

    @Autowired
    EticketService eticketService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST, path = {"/etickets"})
    @ResponseStatus(HttpStatus.CREATED)
    public void createEticket(@Valid @RequestBody EticketDTO eticketDTO) {
        this.eticketService.createEticket(EticketAdapter.transformToEticket(eticketDTO));
    }
    @RequestMapping(method = RequestMethod.GET, path = {"/etickets/{eticketId}"})
    public EticketDTO detailEticket(@PathVariable("eticketId") String eticketId) {
        return EticketAdapter.adaptToEticketDTO(this.eticketService.obtainEticket(eticketId));
    }
    @RequestMapping(method = RequestMethod.GET, path = {"/etickets"})
    public List<EticketDTO> listAllEtickets() {
        return EticketAdapter.adaptToEticketDTOList(this.eticketService.listAllEticket());
    }

}
