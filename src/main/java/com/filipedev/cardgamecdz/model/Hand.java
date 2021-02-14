package com.filipedev.cardgamecdz.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Hand {

    @Getter
    private List<Card> cardsInHands = new ArrayList<>();

    /*


    Deck deck = new Deck();

    public Hand addCardToHand(Card card) {
        if (cardsInHands.size() < 2) {
             this.getCardsInHands().add(deck.WithdrawCard());            
        } else {        
            cardsInHands.add(0, deck.WithdrawCard());
            cardsInHands.remove(0);
        }

    }
*/

}
