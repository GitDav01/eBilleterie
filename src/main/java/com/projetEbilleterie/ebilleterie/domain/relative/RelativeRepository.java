package com.projetEbilleterie.ebilleterie.domain.relative;

import java.util.List;

public interface RelativeRepository {

    String saveRelative(Relative newRelative);
    Relative getRelative(String id) ;
    List<Relative> findAllRelative();
}
