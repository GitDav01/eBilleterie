package com.projetEbilleterie.ebilleterie.domain.relative;

import java.util.List;

public interface RelativeRepository {

 //   Long saveRelative(Relative newRelative);
 //   Relative getRelative(Lnng id) ;
    List<Relative> findAllRelative();
}
