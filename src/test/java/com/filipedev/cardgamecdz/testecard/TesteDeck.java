package com.filipedev.cardgamecdz.testecard;

import com.filipedev.cardgamecdz.model.Card;
import com.filipedev.cardgamecdz.model.Deck;

public class TesteDeck {


    // Cards

    Card card_A = new Card();
    Card card_B = new Card();
    Card card_C = new Card();
    Card card_D = new Card();


    // Deck

    Deck deck_A = new Deck();




    public Deck Teste_Deck(){

        deck_A.getDeckOfCards().add(card_A);
        deck_A.getDeckOfCards().add(card_B);
        deck_A.getDeckOfCards().add(card_C);
        deck_A.getDeckOfCards().add(card_D);

        return deck_A;
    }



}
