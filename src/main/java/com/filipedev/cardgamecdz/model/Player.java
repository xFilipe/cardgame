package com.filipedev.cardgamecdz.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Player {

    @Setter
    private String playerName;
    private Hand hand;
    private Deck deck;




}
