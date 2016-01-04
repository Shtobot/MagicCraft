package com.company.model.player;

import com.company.model.pack.Pack;

/**
 * Created by hugo_obrien on 30.12.2015.
 */
public class Player {

    private String playerName;
    private Pack deck;
    private Pack hand;
    private boolean isActive;

    public Player(String name) {
        this.playerName = name;
    }

    public String getPlayerName() {
        return this.playerName;
    }

}
