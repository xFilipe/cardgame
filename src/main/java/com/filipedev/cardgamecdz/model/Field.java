package com.filipedev.cardgamecdz.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;


@Getter
@ToString
@AllArgsConstructor
public class Field {

    private String fieldSide;
    private ArrayList<Card> cardZone;
    private String phase;


}
