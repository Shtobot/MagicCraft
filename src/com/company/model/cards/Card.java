package com.company.model.cards;

/**
 * Created by hugo_obrien on 19.12.2015.
 */
public abstract class Card {

    private String name;
    private int manaCost;

    public Card(String name, int manaCost) {
        this.name = name;
        this.manaCost = manaCost;
    }

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
