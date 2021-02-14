package com.filipedev.cardgamecdz.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Player {

    private String playerName;
    private int lifePoints;
    private Hand hand;
    private Deck deck;

    // boolean cardSummoned;

    Player(String playerName) {
        this.playerName = playerName;
    }


    public void summonCard(Card card) {
    //    field.getCardZone().add(card);

    }

    /*
    public Card drawCard(){
        Card card = new Card();
        hand.addCardToHand(card);
        return card;
    }

     */


}
