package com.databaseball;

/**
 * Created by bmcquist on 10/10/16.
 */
public class Player {
    private String Name;
    private String ID;

    public Player(String name, String ID) {
        Name = name;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return Name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
