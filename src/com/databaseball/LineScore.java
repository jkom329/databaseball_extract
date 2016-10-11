package com.databaseball;

/**
 * Created by bmcquist on 10/10/16.
 */
public class LineScore {
    private LineScoreLine _homeLine;
    private LineScoreLine _awayLine;

    public LineScore(Team away, Team home) {
        this._awayLine = new LineScoreLine(away);
        this._homeLine = new LineScoreLine(home);

    }
}


