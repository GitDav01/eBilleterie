package com.projetEbilleterie.ebilleterie.infrastructure.providerJPA;

import com.projetEbilleterie.ebilleterie.domain.provider.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderDAO extends JpaRepository<ProviderJPA, String> {
}
