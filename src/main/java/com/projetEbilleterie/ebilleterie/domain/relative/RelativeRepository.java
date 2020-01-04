package com.projetEbilleterie.ebilleterie.domain.relative;

import java.util.List;

public interface RelativeRepository {

 //   Relative getRelative(Lnng id) ;
    List<Relative> findAllRelative();
}
