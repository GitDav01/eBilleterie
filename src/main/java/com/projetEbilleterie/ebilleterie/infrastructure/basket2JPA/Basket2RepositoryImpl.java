package com.projetEbilleterie.ebilleterie.infrastructure.basket2JPA;

import com.projetEbilleterie.ebilleterie.domain.basket2.Basket2;
import com.projetEbilleterie.ebilleterie.domain.basket2.Basket2Repository;
import com.projetEbilleterie.ebilleterie.domain.relative.Relative;
import com.projetEbilleterie.ebilleterie.domain.relative.RelativeRepository;
import com.projetEbilleterie.ebilleterie.infrastructure.RelativeJPA.RelativeDAO;
import com.projetEbilleterie.ebilleterie.infrastructure.RelativeJPA.RelativeJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class Basket2RepositoryImpl implements Basket2Repository {

    @Autowired
    private Basket2DAO basket2DAO;

     @Override
    public List<Basket2> findAllBasket2() {

        return basket2DAO.findAll()
                .stream()
                .map(Basket2JPA::toBasket2)
                .collect(Collectors.toList());
    }
}

