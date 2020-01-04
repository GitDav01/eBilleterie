package com.projetEbilleterie.ebilleterie.infrastructure.basket2JPA;


import com.projetEbilleterie.ebilleterie.domain.basket.Basket;
import com.projetEbilleterie.ebilleterie.domain.basket2.Basket2;
import com.projetEbilleterie.ebilleterie.domain.eticket.TypePrice;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "BASKET2")
public class Basket2JPA {

    @Id
    @GeneratedValue()
    @Column(name = "ID")
    private Long id;
    @Column(name = "QUANTITY")
    private int quantity;
    @Column(name = "STATUS")
    private boolean status;
    @Column(name = "CATEGORY")
    private String category;
    @Column(name = "REFERENCE")
    private String reference;
    @Column(name = "PRICE")
    private double price;
    @Enumerated(EnumType.STRING)
    @Column(name = "TYPE_PRICE")
    private TypePrice typePrice;
    @Temporal(TemporalType.DATE)
    @Column(name = "PURCHASE_DATE")
    private Date purchaseDate;

       //Constructors
    public Basket2JPA(){}

    public Basket2JPA(Basket2 basket2) {
        this.id = basket2.getId();
        this.quantity = basket2.getQuantity();
        this.status = basket2.isStatus();
        this.category = basket2.getCategory();
        this.reference = basket2.getReference();
        this.price = basket2.getPrice();
        this.typePrice = basket2.getTypePrice();
        this.purchaseDate = basket2.getPurchaseDate();
    }

    //Adapter JPA
    Basket2 toBasket2() {
 //
        return new Basket2(id, this.quantity, this.status,this.category,
                this.reference,this.price,this.typePrice ,this.purchaseDate);
    }

    // Getter
    public Long getId() {return id;}
    public int getQuantity() {return quantity;}
    public Boolean isStatus() {return status; }
    public String getCategory() {return category;}
    public String getReference() {return reference;}
    public double getPrice() {return price;}
    public TypePrice getTypePrice() {return typePrice;}
    public Date getPurchaseDate() {return purchaseDate;}
}
