package com.databaseball;

import java.util.HashMap;

/**
 * Created by bmcquist on 10/10/16.
 */
public class LineScoreLine {
    private Team _team;
    private HashMap<Integer, Integer> _innings;
    private int _hitsTotal;
    private int _runsTotal;
    private int _errTotal;

    public LineScoreLine(Team team) {
        this._team=team;
        this._errTotal=0;
        this._runsTotal=0;
        this._hitsTotal=0;

        /* TODO - Clean up innings hashmap */

        this._innings = new HashMap<Integer,Integer>();
    }

    public Team get_team() {
        return _team;
    }

    public void set_team(Team _team) {
        this._team = _team;
    }

    public HashMap<Integer, Integer> get_innings() {
        return _innings;
    }

    public void set_innings(HashMap<Integer, Integer> _innings) {
        this._innings = _innings;
    }

    public int get_hitsTotal() {
        return _hitsTotal;
    }

    public void set_hitsTotal(int _hitsTotal) {
        this._hitsTotal = _hitsTotal;
    }

    public int get_runsTotal() {
        return _runsTotal;
    }

    public void set_runsTotal(int _runsTotal) {
        this._runsTotal = _runsTotal;
    }

    public int get_errTotal() {
        return _errTotal;
    }

    public void set_errTotal(int _errTotal) {
        this._errTotal = _errTotal;
    }

    public void addRun(){
        this._runsTotal++;
    }

    public void addError(){
        this._errTotal++;
    }

    public void addHit(){
        this._hitsTotal++;
    }
}
