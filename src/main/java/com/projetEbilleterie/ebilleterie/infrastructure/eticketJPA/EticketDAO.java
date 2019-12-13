package com.projetEbilleterie.ebilleterie.infrastructure.eticketJPA;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EticketDAO extends JpaRepository<EticketJPA, String> {
}
