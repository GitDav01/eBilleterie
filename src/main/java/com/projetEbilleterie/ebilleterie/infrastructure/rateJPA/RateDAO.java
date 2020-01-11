package com.projetEbilleterie.ebilleterie.infrastructure.rateJPA;

import com.projetEbilleterie.ebilleterie.domain.eticket2.TypePrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

interface RateDAO extends JpaRepository<RateJPA, Long> {
    //@Modifying
//    @Query("UPDATE RATE SET quantity= :newQuantity where Eticket_id = : eticketId and  type_price = : typePrice;")
//    public void updateStockRateQuery(@Param("newQuantity") int newQuantity,@Param("eticketId") Long eticketId,
//                                     @Param("typePrice") TypePrice typePrice);
    }

