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


    public void addCardToHand() {
        Deck deck = new Deck();

        if (cardsInHands.size() < 5) {
            cardsInHands.add(0, deck.WithdrawCard());
        } else {
            cardsInHands.add(5, deck.WithdrawCard());
            cardsInHands.remove(5);
        }


    }


}
