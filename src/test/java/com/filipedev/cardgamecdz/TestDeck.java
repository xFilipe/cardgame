package com.filipedev.cardgamecdz;

import com.filipedev.cardgamecdz.model.Deck;

public class TestDeck {

    public static void main(String[] args) {

        // Deck A

        Deck deck_A = new Deck();
        deck_A.setName("Deck A");

        deck_A.createDeck("C:\\Users\\Filipe\\Desktop\\Estudos\\cardgame\\src\\main\\java\\com\\filipedev\\cardgamecdz\\cards\\deck1.csv");

        deck_A.shuffleDeck();

        System.out.println("-----------------------------------------------------------");
        System.out.println(deck_A.getName() + " atualmente: " + deck_A.getDeckOfCards());
        System.out.println("Sacando a primeira carta: " + deck_A.WithdrawCard());
        System.out.println(deck_A.getName() + " Deck após sacar: " + deck_A.getDeckOfCards());
        System.out.println("-----------------------------------------------------------");


        // Deck B

        Deck deck_B = new Deck();

        deck_B.setName("Deck B");

        deck_B.createDeck("C:\\Users\\Filipe\\Desktop\\Estudos\\cardgame\\src\\main\\java\\com\\filipedev\\cardgamecdz\\cards\\deck1.csv");

        deck_B.shuffleDeck();

        System.out.println(deck_B.getName() + " atualmente: " + deck_B.getDeckOfCards());
        System.out.println("Sacando a primeira carta: " + deck_B.WithdrawCard());
        System.out.println(deck_B.getName() + " após sacar: " + deck_B.getDeckOfCards());
        System.out.println("-----------------------------------------------------------");


    }

}
