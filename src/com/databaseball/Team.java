package com.databaseball;

import java.util.HashMap;

/**
 * Created by bmcquist on 10/10/16.
 */
public class Team {
    private String _name;
    private int _id;

    public Team(String _name) {
        this._name = _name;
        //this._id = _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }
}
