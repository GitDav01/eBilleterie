package com.projetEbilleterie.ebilleterie.infrastructure.providerJPA;


import com.projetEbilleterie.ebilleterie.infrastructure.customerJPA.CustomerJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProviderDAO extends JpaRepository<ProviderJPA, Long> {

    @Query("SELECT p FROM PROVIDER p WHERE p.provider = ?1")
    ProviderJPA searchByNameQuery(String name);
    // JPA se d�brouille pour reconstruire la Query avec le mot cl� FindByXXX
    ProviderJPA findByProvider(String name);
}
