package com.company.model.turn;

import com.company.model.Exceptions.EmptyPackException;
import com.company.model.pack.Combination;
import com.company.model.pack.Pack;
import com.company.model.player.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hugo_obrien on 04.01.2016.
 */
public class Turn {

    private Player activePlayer;
    private Player passivePlayer;
    private Combination combination;
    private boolean endTurn = false;
    private boolean endGame;
    BufferedReader reader;

    public Turn(Player firstPlayer, Player secondPlayer) {

        setActivity(firstPlayer, secondPlayer);
        try {
            activePlayer.drawCardToHand(-1);
        } catch (EmptyPackException e) {
            System.out.println("You have run out of cards");
        }

        reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Turn of " + activePlayer.getPlayerName());
        while (!endTurn && !endGame) {
            System.out.println("Enter the number of command:");
            System.out.println("1 - add card to combination");
            System.out.println("2 - cast the combination");
            System.out.println("3 - end turn");
            System.out.println("4 - end game");
            try {
                String command = reader.readLine();
                switch (command) {
                    case "1":
                        addCard();
                        break;
                    case "2":
                        cast();
                        break;
                    case "3":
                        setEndTurn();
                        break;
                    case "4":
                        setEndGame();
                        break;
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Wrong command");
            }
        }
    }

    public Pack getCombination() {
        return combination;
    }

    public void addCard() {
        //TODO запилить
        System.out.println("Adding card");
        System.out.println("I have not yet complete this, try again later");
    }

    public void cast() {
        //TODO запилить
        System.out.println("Casting combination");
        System.out.println("I have not yet complete this, try again later");
    }

    public void setEndTurn() {
        System.out.println("Ending turn");
        endTurn = true;
    }

    public void setActivity(Player first, Player second) {
        if (first.isActive() && !second.isActive()) {
            activePlayer = first;
            passivePlayer = second;
        } else {
            activePlayer = second;
            passivePlayer = first;
        }
    }

    public boolean isEndGame() {
        return endGame;
    }

    public void setEndGame() {
        System.out.println("Ending game");
        endGame = true;
    }
}
