package com.company.model.session;

import com.company.model.player.Player;

/**
 * Created by hugo_obrien on 30.12.2015.
 */
public class Session {

    private Player player1;
    private Player player2;

    public Session(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public Player getPlayer(int playerNum) {
        if (playerNum == 1) {
            return player1;
        } else {
            return player2;
        }
    }
}
