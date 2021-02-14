package com.filipedev.cardgamecdz;

import com.filipedev.cardgamecdz.model.Card;

public class TesteCard {

    public static void main(String[] args) {


        // Card A
        Card card_A = new Card();

        card_A.setNome("Carta A");
        card_A.setAtk("50");
        card_A.setDef("20");

        System.out.println(card_A);


        // Card B

        Card card_B = new Card();

        card_B.setNome("Carta B");
        card_B.setAtk("20");
        card_B.setDef("50");


        System.out.println(card_B);
    }

}
