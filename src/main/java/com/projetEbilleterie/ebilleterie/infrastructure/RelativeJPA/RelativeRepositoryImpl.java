package com.projetEbilleterie.ebilleterie.infrastructure.RelativeJPA;

import com.projetEbilleterie.ebilleterie.domain.relative.Relative;
import com.projetEbilleterie.ebilleterie.domain.relative.RelativeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RelativeRepositoryImpl implements RelativeRepository {

    @Autowired
    private RelativeDAO relativeDAO;

    @Override
    public String saveRelative(Relative relative) {
        RelativeJPA relativeJPA = relativeDAO.save(new RelativeJPA(relative));
        return relativeJPA.getId();
    }

    @Override
    public Relative getRelative(String id) {
        return null;
    }

    @Override
    public List<Relative> findAllRelative() {
        return null;
    }
}
