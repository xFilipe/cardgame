package com.filipedev.cardgamecdz.model;


public class Game {


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


    public void startNewGame() {

    }


}
