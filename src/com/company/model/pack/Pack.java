package com.company.model.pack;

import com.company.model.Exceptions.EmptyPackException;
import com.company.model.cards.Card;

import java.util.ArrayList;

/**
 * Created by hugo_obrien on 19.12.2015.
 */
public abstract class Pack {

    protected ArrayList<Card> cards;

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

    public Card getCardByIndex(int index) {
        Card card = cards.get(index);
        return card;
    }

    public void removeCardByIndex(int index) {
        cards.remove(index);
    }

    public Card getAndRemoveCardByIndex(int index) throws EmptyPackException {
        if (cards.size() == 0) {
            throw new EmptyPackException();
        }
        Card card = getCardByIndex(index);
        removeCardByIndex(index);
        return card;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int getSize() {
        return cards.size();
    }

}
