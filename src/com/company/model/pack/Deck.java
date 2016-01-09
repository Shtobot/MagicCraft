package com.company.model.pack;

import com.company.model.cards.Card;
import com.company.model.cards.TestCard;

import java.util.ArrayList;

/**
 * Created by hugo_obrien on 04.01.2016.
 */
public class Deck extends Pack {

    public Deck() {
        cards = new ArrayList<Card>();
    }

    /**
     * Создадим колоду из десяти карт для упрощения разработки и тестирования
     * TODO потом выпилить и запилить нормально
     */
    public void createTestDeck() {
        for (int i=0; i<4; i++) {
            cards.add(new TestCard("Card"+i, 1));
        }
    }
}
