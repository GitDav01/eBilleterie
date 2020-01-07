package com.projetEbilleterie.ebilleterie;

import com.projetEbilleterie.ebilleterie.domain.customer.Customer;
import com.projetEbilleterie.ebilleterie.domain.customer.Profil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerApplicationtests {

    @Test
    public void entities_should_be_equal_if_same_identity() {

        Customer c1 =new Customer(1L, "lastname1","firstname1", Profil.EXTERNAL,"email","phoneNumber",
                null,null,null,null);
        Customer c2 =new Customer(1L, "lastname2","firstname2", Profil.INTERNAL, "email","phoneNumber",
                null,null,null,null);


        Assert.assertEquals(c1, c2);
    }
    @Test
    public void value_objets_should_be_equal_if_same_properties(){

    }
}
