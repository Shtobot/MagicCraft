package com.company.model.cards;

/**
 * Created by ������ on 19.12.2015.
 */
public class Card {

    private String name;
    private int manaCost;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    public int getManaCost() {
        return this.manaCost;
    }

}
