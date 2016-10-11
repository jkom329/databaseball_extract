package com.databaseball;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bmcquist on 10/10/16.
 */
public class BattingStats {
    private List<BatStatLine> home;
    private List<BatStatLine> away;

    public BattingStats() {
        this.home = new ArrayList<BatStatLine>();
        this.away = new ArrayList<BatStatLine>();
    }

    public void addBatter(Player batter, int isHome){
        if (isHome == 1){
            home.add(new BatStatLine(batter));
        }
        else {
            away.add(new BatStatLine(batter));
        }
    }
}
