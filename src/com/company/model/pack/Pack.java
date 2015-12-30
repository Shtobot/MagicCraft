package com.company.model.pack;

import com.company.model.cards.Card;

import java.util.ArrayList;

/**
 * Created by hugo_obrien on 19.12.2015.
 */
public class Pack {

    ArrayList<Card> pack;

    public Pack() {
        pack = new ArrayList<>();
    }

    public void addCard(Card card) {
        this.pack.add(card);
    }
}
