package com.mycompany.trackhabitsapp2.abstractions;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractEntytyList<Entyty> {
    private ArrayList<Entyty> entytylist;

    public AbstractEntytyList() {
        this.entytylist = new ArrayList<Entyty>();
    }

    public ArrayList<Entyty> getEntytylist() {
        return entytylist;
    }

    public void add(Entyty aEntyty) {
        entytylist.add(aEntyty);
    }
    
    public String toString() {
        String c = "";
        for (Entyty e : entytylist) {
            c += e.toString() + "\n";
        }
        return c;
    }
    
    
    public boolean isTheListEmpty() {
        return entytylist.isEmpty();
    }
    
    public boolean isTheListNull() {
        return (entytylist == null);
    }
}
