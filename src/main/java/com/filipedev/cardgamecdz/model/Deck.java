package com.filipedev.cardgamecdz.model;

import lombok.Getter;
import lombok.Setter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {

    @Getter
    @Setter
    private String name;

    @Getter
    private List<Card> deckOfCards = new ArrayList<>();


    public Card WithdrawCard() {

        Card card = deckOfCards.get(0);
        deckOfCards.remove(0);
        return card;
    }

    public void addCardToDeck(Card card) {
        deckOfCards.add(card);
    }

    public void shuffleDeck() {
        Collections.shuffle(getDeckOfCards());
    }


    public void createDeck(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            ArrayList<String[]> lines = new ArrayList<>();
            String line = "";
            String headerLine = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] linesplit = line.split(",");
                lines.add(linesplit);

            }
            for (int i = 0; i < lines.size(); i++) {
                Card card = new Card(lines.get(i)[0], lines.get(i)[1], lines.get(i)[2]);
                deckOfCards.add(card);
            }


        } catch (IOException e) {
            e.printStackTrace();

        }


    }


}
