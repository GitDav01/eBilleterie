package com.projetEbilleterie.ebilleterie.infrastructure.customerJPA;

import com.projetEbilleterie.ebilleterie.infrastructure.providerJPA.ProviderJPA;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDAO extends JpaRepository<ProviderJPA, String> {
}
