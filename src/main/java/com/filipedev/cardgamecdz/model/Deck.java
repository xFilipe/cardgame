package com.filipedev.cardgamecdz.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.List;


public class Deck {

    @Getter
    @Setter
    private String name;

    @Getter
    private List<Card> deckOfCards;
    
    public Card WithdrawCard() {

        Card card = deckOfCards.get(0);
        deckOfCards.remove(0);
        return card;
    }

    public void addCardToDeck(Card card) {
        deckOfCards.add(card);
    }

    public void shuffleDeck() {
        Collections.shuffle(getDeckOfCards());
    }
}
