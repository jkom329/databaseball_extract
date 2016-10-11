package com.databaseball;

/**
 * Created by bmcquist on 10/10/16.
 */
public class BoxScore {

    private LineScore lineScore;
    private BattingStats battingStats;
    private String ID;


    public BoxScore() {
        this.battingStats = new BattingStats();
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public LineScore getLineScore() {
        return lineScore;
    }

    public void setLineScore(LineScore lineScore) {
        this.lineScore = lineScore;
    }

    public void makeLineScore(Team home, Team away){
        this.lineScore = new LineScore(home,away);
    }

    public BattingStats getBattingStats() {
        return battingStats;
    }
}
