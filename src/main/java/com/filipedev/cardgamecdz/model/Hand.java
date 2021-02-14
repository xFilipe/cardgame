package com.filipedev.cardgamecdz.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class Hand {

    @Getter
    private List<Card> cardsInHands = new ArrayList<>();

    Deck deck;

    public void addCardToHand() {


        if (cardsInHands.size() < 2) {

            this.getCardsInHands().add(deck.WithdrawCard());
            System.out.println("Aqui no if");
        } else {
            System.out.println("Aqui no else");
            cardsInHands.add(0, deck.WithdrawCard());
            cardsInHands.remove(0);
        }


    }


}
