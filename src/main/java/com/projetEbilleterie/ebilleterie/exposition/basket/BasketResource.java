package com.projetEbilleterie.ebilleterie.exposition.basket;

import com.projetEbilleterie.ebilleterie.application.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class BasketResource {

    @Autowired
    private BasketService basketService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST, path = {"/baskets"})
    @ResponseStatus(HttpStatus.CREATED)
    public void createBasket(@Valid @RequestBody BasketDTO basketDTO) {
        this.basketService.createBasket(BasketAdapter.transformToBasket(basketDTO));
    }
    @RequestMapping(method = RequestMethod.GET, path = {"/baskets/{basketId}"})
    public BasketDTO detailBasket(@PathVariable("basketId") Long basketId) {
        return BasketAdapter.adaptToBasketDTO(this.basketService.obtainBasket(basketId));
    }
    @RequestMapping(method = RequestMethod.GET, path = {"/baskets"})
    public List<BasketDTO> listAllBaskets() {
        return BasketAdapter.adaptToBasketDTOList(this.basketService.listAllBasket());
    }
}
