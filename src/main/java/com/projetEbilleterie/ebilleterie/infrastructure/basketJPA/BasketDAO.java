package com.projetEbilleterie.ebilleterie.infrastructure.basketJPA;

import org.springframework.data.jpa.repository.JpaRepository;

interface BasketDAO extends JpaRepository<BasketJPA, String> {
}
