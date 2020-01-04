package com.projetEbilleterie.ebilleterie.exposition.relative;

import com.projetEbilleterie.ebilleterie.application.CustomerService;
import com.projetEbilleterie.ebilleterie.application.RelativeService;
import com.projetEbilleterie.ebilleterie.domain.relative.Relative;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class RelativeResource {

    @Autowired
    RelativeService relativeService;
    @Autowired
    CustomerService customerService;



 //   @RequestMapping(method = RequestMethod.GET, path = {"/relatives/{relativeId}"})
 //   public RelativeDTO detailRelative(@PathVariable("relativeId") String relativeId) {
 //       return RelativeAdapter.adaptToRelativeDTO(this.relativeService.obtainRelative(relativeId));
  //  }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, path = {"/relatives"})
    public List<RelativeDTO> listAllRelatives() {
        return RelativeAdapter.adaptToRelativeDTOList(this.relativeService.listAllRelative());
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/customers/{customerId}/relatives"})
    public List<RelativeDTO> listAllRelativesFromCustomer(@PathVariable("customerId") Long customerId) {
        List<Relative> relatives = this.customerService.listAllRelatives(customerId);
        return RelativeAdapter.adaptToRelativeDTOList(relatives);
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/customers/{customerId}/relative"})
    @ResponseStatus(HttpStatus.CREATED)
    public void addRelativeToCustomer(@PathVariable("customerId") Long customerId, @RequestBody RelativeDTO relativeDTO) {
        this.customerService.addRelative(customerId, RelativeAdapter.transformToRelative(relativeDTO));
    }

    @RequestMapping(method = RequestMethod.DELETE, path = {"/customers/{customerId}/relatives/{relativeId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeRelativeFromCustomer(@PathVariable("customerId") Long customerId, @PathVariable("relativeId") Long relativeId) {
        this.customerService.removeRelative(customerId, relativeId);
    }

    @RequestMapping(method = RequestMethod.PUT, path = {"/customers/{customerId}/relatives/{relativeId}"})
    public void updateRelative(@PathVariable("customerId") Long customerId, @PathVariable("relativeId") Long relativeId, @RequestBody RelativeDTO relativeDTO) {
        this.customerService.updateRelative(customerId, relativeId, RelativeAdapter.transformToRelative(relativeDTO));
    }
}
