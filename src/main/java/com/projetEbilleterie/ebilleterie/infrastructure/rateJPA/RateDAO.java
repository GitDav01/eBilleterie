package com.projetEbilleterie.ebilleterie.infrastructure.rateJPA;

import org.springframework.data.jpa.repository.JpaRepository;

interface RateDAO extends JpaRepository<RateJPA, Long> {
}
