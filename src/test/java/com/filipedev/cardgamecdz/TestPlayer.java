package com.filipedev.cardgamecdz;

import com.filipedev.cardgamecdz.model.Card;
import com.filipedev.cardgamecdz.model.Deck;
import com.filipedev.cardgamecdz.model.Hand;
import com.filipedev.cardgamecdz.model.Player;

public class TestPlayer {
    public static void main(String[] args) {


        // Deck

        Deck deck = new Deck();
        deck.setName("Deck Player One");
        deck.setDeckId("C:\\Users\\Filipe\\Desktop\\Estudos\\cardgame\\src\\main\\java\\com\\filipedev\\cardgamecdz\\cards\\deck1.csv");
        deck.createDeck(deck.getDeckId());


        // Hand
        Hand hand = new Hand();
        hand.getCardsInHands().add(deck.WithdrawCard());


        // Player
        Player player = new Player();
        player.setPlayerName("Player one name");
        player.setDeck(deck);
        player.setHand(hand);


        System.out.println(player);


    }
}
