package com.puroapi.services.product.expose;

import com.puroapi.services.product.model.Card;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rx.Single;


@RestController
@RequestMapping("/cards/credit-card/v1")
public class ProductController   {

    @GetMapping(value = "/creditcardtransactions", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Single<Card> getCreditCardTransaction() {

        Card card = new Card();
        card.setCardId("4213676778787878");
        card.setId("1234");
        card.setName("DAVID INGA");
        card.setDueDate("2022-08");
        return Single.just(card);
    }
}
