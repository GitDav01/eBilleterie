package com.projetEbilleterie.ebilleterie.domain.user;
import com.projetEbilleterie.ebilleterie.infrastructure.customerJPA.CustomerJPA;

import java.util.List;

public interface UserRepository {

    CustomerJPA findOne(String username);
   //Customer findById(int id);

}
