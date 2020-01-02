package com.projetEbilleterie.ebilleterie.application;

import com.projetEbilleterie.ebilleterie.domain.customer.Customer;
import com.projetEbilleterie.ebilleterie.domain.relative.Relative;
import com.projetEbilleterie.ebilleterie.domain.relative.RelativeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Transactional
@Service
public class RelativeService {

    @Autowired
    RelativeRepository relativeRepository;

 //   public Relative obtainRelative(Long id) {return this.relativeRepository.getRelative(id); }
 //   public Long createRelative(Relative newRelative) {return this.relativeRepository.saveRelative(newRelative);}
    public List<Relative> listAllRelative() {
        return this.relativeRepository.findAllRelative();
    }



}
