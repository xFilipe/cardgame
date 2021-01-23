package com.filipedev.cardgamecdz.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;



@Setter
@Getter
public class Deck {

    private String name;
    private List<Card> deckOfCards;


    public Card WithdrawCard() {

        Card card = deckOfCards.get(0);
        deckOfCards.remove(0);

        return card;


    }


}
