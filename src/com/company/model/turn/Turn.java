package com.company.model.turn;

import com.company.model.pack.Combination;
import com.company.model.pack.Pack;
import com.company.model.player.Player;

/**
 * Created by hugo_obrien on 04.01.2016.
 */
public class Turn {

    private Player activePlayer;
    private Player passivePlayer;
    private Combination combination;

    public Turn(Player activePlayer, Player passivePlayer) {
        this.activePlayer = activePlayer;
        this.passivePlayer = passivePlayer;
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
}
