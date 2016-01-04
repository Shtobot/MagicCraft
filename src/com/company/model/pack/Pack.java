package com.company.model.pack;

import com.company.model.cards.Card;

import java.util.ArrayList;

/**
 * Created by hugo_obrien on 19.12.2015.
 */
public abstract class Pack {

    ArrayList<Card> cards;

    public Pack() {
        cards = new ArrayList<Card>();
    }

    public Pack(Card card) {
        cards = new ArrayList<Card>();
        cards.add(card);
    }

    public Pack(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public Pack(Pack pack) {
        this.cards = pack.getCards();
    }

    public ArrayList<Card> getCards() {
        return this.cards;
    }

}
