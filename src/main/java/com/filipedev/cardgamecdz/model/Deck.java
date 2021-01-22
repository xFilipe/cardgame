package com.filipedev.cardgamecdz.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;


@Setter
@Getter
public class Deck {

    private String name;
    private ArrayList<Card> deckOfCards;


    public Card WithdrawCard() {

        Card card = deckOfCards.get(0);
        deckOfCards.remove(0);

        return card;


    }


}
