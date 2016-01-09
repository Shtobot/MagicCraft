package com.company.model.player;

import com.company.model.Exceptions.EmptyPackException;
import com.company.model.cards.Card;
import com.company.model.pack.Deck;
import com.company.model.pack.Hand;
import com.company.model.pack.Pack;

import java.util.Random;

/**
 * Created by hugo_obrien on 30.12.2015.
 */
public class Player {

    private String playerName;
    private Deck deck;
    private Hand hand;
    private boolean active;

    public Player(String name) {
        this.playerName = name;
        deck = new Deck();
        hand = new Hand();

        // для разработки и тестирования
        // TODO потом выпилить и запилить нормально
        deck.createTestDeck();
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public boolean isActive() {
        return this.active;
    }

    public void activate() {
        this.active = true;
    }

    public void deactivate() {
        this.active = false;
    }

    /**
     * Берет карту из колоды и кладет ее в руку
     * @param cardIndex - индекс карты, -1 - случайная карта
     */
    public void drawCardToHand(int cardIndex) throws EmptyPackException {
        int index;
        if (cardIndex == -1) {
            Random random = new Random();
            try {
                index = random.nextInt(deck.getSize());
            } catch (IllegalArgumentException ex) {
                throw new EmptyPackException("You have run out of cards");
            }
        } else {
            index = cardIndex;
        }
        try {
            hand.addCard(deck.getAndRemoveCardByIndex(index));
        } catch (EmptyPackException ex) {
            throw ex;
        }
    }

    public Deck getDeck() {
        return deck;
    }

    public Hand getHand() {
        return hand;
    }
}
