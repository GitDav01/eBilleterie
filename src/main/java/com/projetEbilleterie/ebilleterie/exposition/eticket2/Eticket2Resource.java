package com.projetEbilleterie.ebilleterie.exposition.eticket2;


import com.projetEbilleterie.ebilleterie.application.Eticket2Service;
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
    @RequestMapping(method = RequestMethod.POST, path = {"/etickets2"})
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
}
