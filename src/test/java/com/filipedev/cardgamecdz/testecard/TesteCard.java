package com.filipedev.cardgamecdz.testecard;

import com.filipedev.cardgamecdz.model.Card;

public class TesteCard {


    public void Teste_Card() {

        Card card_A = new Card();

        card_A.setNome("Carta A");
        card_A.setAtk(50);
        card_A.setDef(20);

        Card card_B = new Card();

        card_B.setNome("Carta A");
        card_B.setAtk(20);
        card_B.setDef(50);


        System.out.println(card_A + "  " + card_B);

    }


}
