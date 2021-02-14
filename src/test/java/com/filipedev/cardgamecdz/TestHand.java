package com.filipedev.cardgamecdz;

import com.filipedev.cardgamecdz.model.Deck;
import com.filipedev.cardgamecdz.model.Hand;

public class TestHand {

    public static void main(String[] args) {


        Deck deck_A = new Deck();
        deck_A.setName("Deck A");

        deck_A.createDeck("C:\\Users\\Filipe\\Desktop\\Estudos\\cardgame\\src\\main\\java\\com\\filipedev\\cardgamecdz\\cards\\deck1.csv");

        Hand hand = new Hand();


        deck_A.shuffleDeck();

        hand.getCardsInHands().add(deck_A.WithdrawCard());
        hand.getCardsInHands().add(deck_A.WithdrawCard());
        hand.getCardsInHands().add(deck_A.WithdrawCard());
        System.out.println(hand.getCardsInHands());


    }

}
