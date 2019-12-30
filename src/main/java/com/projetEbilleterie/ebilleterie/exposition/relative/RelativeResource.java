package com.projetEbilleterie.ebilleterie.exposition.relative;

import com.projetEbilleterie.ebilleterie.application.RelativeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class RelativeResource {

    @Autowired
    RelativeService relativeService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST, path = {"/relatives"})
    @ResponseStatus(HttpStatus.CREATED)
    public void createRelative(@Valid @RequestBody RelativeDTO relativeDTO) {
        this.relativeService.createRelative(RelativeAdapter.transformToRelative(relativeDTO));
    }
    @RequestMapping(method = RequestMethod.GET, path = {"/relatives/{relativeId}"})
    public RelativeDTO detailRelative(@PathVariable("relativeId") String relativeId) {
        return RelativeAdapter.adaptToRelativeDTO(this.relativeService.obtainRelative(relativeId));
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/relatives"})
    public List<RelativeDTO> listAllRelatives() {
        return RelativeAdapter.adaptToRelativeDTOList(this.relativeService.listAllRelative());
    }
}
