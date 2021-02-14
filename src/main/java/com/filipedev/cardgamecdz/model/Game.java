package com.filipedev.cardgamecdz.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Game {

    /*

    private Player player;
    private Player opponent;
    private Player currentPlayer;
    private boolean winner = false;


    public void SwitchPlayer() {
        if (winner == false) {
            if (currentPlayer == player) {
                currentPlayer = opponent;
            } else {
                currentPlayer = player;
            }
        }
    }


    private void createDeck(Player player, String fileName) {
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
                Card card = new Card(lines.get(i)[0], Integer.parseInt(lines.get(i)[2]), Integer.parseInt(lines.get(i)[3]));
                player.getDeck().addCardToDeck(card);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void startNewGame() {
        player = new Player("Player One");
        opponent = new Player("Player Two");

        createDeck(player, "/cards/deck1.csv");
        createDeck(opponent, "/cards/deck2.csv");

        player.getDeck().shuffleDeck();
        opponent.getDeck().shuffleDeck();


        for (int i = 0; i < 5; i++) {
            player.drawCard();
            opponent.drawCard();
        }

        currentPlayer = player;

    }
     */


}
