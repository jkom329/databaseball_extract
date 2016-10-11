package com.databaseball;

/**
 * Created by bmcquist on 10/10/16.
 */
public class BatStatLine {
    private Player batter;
    private int atBats;
    private int hits;
    private int rbi;

    public BatStatLine(Player batter) {
        this.batter = batter;
    }

    public BatStatLine(){

    }

    private void addHit(){
        this.hits++;
    }

    private void addAtBat(){
        this.atBats++;
    }

    private void addRbi(){
        this.rbi++;
    }

    @Override
    public String toString() {
        return batter.toString() + "\t" +
                this.atBats + " " +
                this.hits + " " +
                this.rbi;
    }
}
