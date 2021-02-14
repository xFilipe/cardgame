package com.filipedev.cardgamecdz.model;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Player {


    private long id;
    private String playerName;
    private Hand hand;
    private Deck deck;




}
