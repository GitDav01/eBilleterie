package com.projetEbilleterie.ebilleterie;

import com.projetEbilleterie.ebilleterie.domain.provider.Category;
import com.projetEbilleterie.ebilleterie.domain.provider.Provider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProviderApplicationTests {

    @Test
    public void entities_should_be_equal_if_same_identity() {

        Provider p1 =new Provider("1", "name1", Category.CINEMA);
        Provider p2 =new Provider("1", "name2", Category.CONCERT);

        Assert.assertEquals(p1, p2);
    }

    @Test
    public void value_objets_should_be_equal_if_same_properties(){
    }
}
