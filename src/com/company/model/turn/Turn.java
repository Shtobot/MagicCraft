package com.company.model.turn;

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
    private boolean isEndTurn = false;
    BufferedReader reader;

    public Turn(Player activePlayer, Player passivePlayer) {
        this.activePlayer = activePlayer;
        this.passivePlayer = passivePlayer;
        reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Turn of " + activePlayer.getPlayerName());
        while (!isEndTurn) {
            System.out.println("Enter the number of command:");
            System.out.println("1 - add card to combination");
            System.out.println("2 - cast the combination");
            System.out.println("3 - end turn");
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
                        endTurn();
                        break;
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Wrong command");
            }
        }
    }

    public Player getActivePlayer() {
        return activePlayer;
    }

    public Player getPassivePlayer() {
        return passivePlayer;
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

    public void endTurn() {
        System.out.println("Ending turn");
        isEndTurn = true;
    }
}
