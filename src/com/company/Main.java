package com.company;

import com.company.model.player.Player;
import com.company.model.session.Session;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player player1 = new Player("First");
        Player player2 = new Player("Secound");
        Session session = new Session(player1, player2);
    }
}
