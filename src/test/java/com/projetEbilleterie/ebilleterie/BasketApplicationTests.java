package com.projetEbilleterie.ebilleterie;

import com.projetEbilleterie.ebilleterie.domain.basket.Basket;
import com.projetEbilleterie.ebilleterie.domain.provider.Category;
import com.projetEbilleterie.ebilleterie.domain.provider.Provider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BasketApplicationTests {

    @Test
    public void entities_should_be_equal_if_same_identity() {

        Basket b1 =new Basket(1L, 3, true);
        Basket b2 =new Basket(1L, 4, false);

        Assert.assertEquals(b1, b2);
    }
    @Test
    public void value_objets_should_be_equal_if_same_properties(){
    }
}
