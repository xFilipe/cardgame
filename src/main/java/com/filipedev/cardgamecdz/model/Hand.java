package com.filipedev.cardgamecdz.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class Hand {

    @Getter
    private List<Card> cardsInHands;

    // private String playerHand


    public void addCardToHand(Card card) {
        Deck deck = new Deck();

        if (cardsInHands.size() < 5) {
            cardsInHands.add(0, deck.WithdrawCard());
        } else {
            cardsInHands.add(0, deck.WithdrawCard());
            cardsInHands.remove(0);
        }


    }


}
