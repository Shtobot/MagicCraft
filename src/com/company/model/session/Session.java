package com.company.model.session;

import com.company.model.player.Player;
import com.company.model.turn.Turn;

import java.util.Random;

/**
 * Created by hugo_obrien on 30.12.2015.
 */
public class Session {

    private Player player1;
    private Player player2;
    //private Turn currentTurn;
    private boolean endGame = false;

    public Session(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;

        Random random = new Random();
        int randomRes = random.nextInt(2);
        if (randomRes == 0) {
            this.player1.activate();
            this.player2.deactivate();
        } else {
            this.player1.deactivate();
            this.player2.activate();
        }

        while (!endGame) {
            Turn turn = new Turn(player1, player2);
            endGame = turn.isEndGame();
            changeActivity();
        }
    }

    public Player getPlayer(int playerNum) {
        if (playerNum == 1) {
            return player1;
        } else {
            return player2;
        }
    }

    public void changeActivity() {
        if (player1.isActive() && !player2.isActive()) {
            player1.deactivate();
            player2.activate();
        } else {
            player1.activate();
            player2.deactivate();
        }
    }
}
