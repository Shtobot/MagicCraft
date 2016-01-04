package com.company.model.session;

import com.company.model.player.Player;
import com.company.model.turn.Turn;
import jdk.internal.util.xml.impl.Pair;

import java.util.Random;

/**
 * Created by hugo_obrien on 30.12.2015.
 */
public class Session {

    private Player player1;
    private Player player2;
    private Turn currentTurn;

    public Session(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;

        Random random = new Random();
        int randomRes = random.nextInt(2);
        if (randomRes == 0) {
            currentTurn = new Turn(player1, player2);
        } else {
            currentTurn = new Turn(player2, player1);
        }
    }

    public Player getPlayer(int playerNum) {
        if (playerNum == 1) {
            return player1;
        } else {
            return player2;
        }
    }
}
