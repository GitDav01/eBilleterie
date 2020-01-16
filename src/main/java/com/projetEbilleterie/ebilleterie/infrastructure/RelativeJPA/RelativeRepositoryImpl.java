package com.projetEbilleterie.ebilleterie.infrastructure.RelativeJPA;

import com.projetEbilleterie.ebilleterie.domain.exception.ErrorCodes;
import com.projetEbilleterie.ebilleterie.domain.exception.MyAppTicketException;
import com.projetEbilleterie.ebilleterie.domain.relative.Relative;
import com.projetEbilleterie.ebilleterie.domain.relative.RelativeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class RelativeRepositoryImpl implements RelativeRepository {

    @Autowired
    private RelativeDAO relativeDAO;

    @Override
    public List<Relative> findAllRelative() {

        return relativeDAO.findAll()
                .stream()
                .map(RelativeJPA::toRelative)
                .collect(Collectors.toList());
    }
}

