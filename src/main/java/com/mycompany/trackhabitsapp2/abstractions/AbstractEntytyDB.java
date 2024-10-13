package com.mycompany.trackhabitsapp2.abstractions;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractEntytyDB {
    //private HashMap<String,ArrayList<Entyty>> entytyDB;
    private HashMap<String, AbstractEntytyList<AbstractEntyty>> entytyDB;
    
    
    public AbstractEntytyDB() {
        this.entytyDB = new HashMap<>();
    }
    
    public boolean IsKeyContained(String key) {
        if (entytyDB == null) return false;
        if (entytyDB.isEmpty()) return false;
        
        //for (Map.Entry<String, ArrayList<Entyty>> entry : entytyDB.entrySet()) {
        for (Map.Entry<String, AbstractEntytyList<AbstractEntyty>> entry : entytyDB.entrySet()) {
                String mapKey = entry.getKey();
                if (key.equals(mapKey)) return true;
        }
        return false;
    }
    
    // Add as Add HashSet Element 
    public HashMap addEntyty(String key, AbstractEntyty aEntyty) {
        if(entytyDB.isEmpty()) {
            AbstractEntytyList<AbstractEntyty> aEntytyArrayList = new AbstractEntytyList<>() {};
            aEntytyArrayList.add(aEntyty);
            entytyDB.put(key, aEntytyArrayList);
        } else if (entytyDB.containsKey(key)) {
            listForTheKey(key).getEntytylist().add(aEntyty);
        }
        
        
        //System.out.println(entytyDB.size());
        return entytyDB;
    }
    
    public HashMap update(String key, AbstractEntyty aEntyty) {
        if (IsKeyContained(key)) {
            listForTheKey(key).add(aEntyty);
        }
        entytyDB.put(key, listForTheKey(key));
        return entytyDB;
    }
    
    // Delete as Remove HashSet Element 
    public HashMap remove(String str) {
        entytyDB.remove(str);
        return entytyDB;
    }
    
    public AbstractEntytyList<AbstractEntyty> listForTheKey(String key) {
        for (Map.Entry<String, AbstractEntytyList<AbstractEntyty>> entry : entytyDB.entrySet()) {
            String mapKey = entry.getKey();
            if (key.equals(mapKey)) return entry.getValue();
        }
        return null;
    }
    
    public AbstractEntyty lastInListForTheKey(String key) {
        int lastInex = listForTheKey(key).getEntytylist().size() - 1;
        return listForTheKey(key).getEntytylist().get(lastInex);
    }
    
//     public boolean isValidLast(String key, String name) {
//        for (Map.Entry<String, AbstractEntytyList<AbstractEntyty>> entry : entytyDB.entrySet()) {
//            String mapKey = entry.getKey();
//            if (key.equals(mapKey)) {
//                int i = 0;
//                int s = entry.getValue().getEntytylist().size();
//                for (AbstractEntyty e : entry.getValue().getEntytylist()) {
//                    e.
//                }
//            }
//        }
//                 
//        return false;
//    }
    
    public String toString() {
        String c = "";
        for (Map.Entry<String, AbstractEntytyList<AbstractEntyty>> entry : entytyDB.entrySet()) {
            c += entry.getKey().toString() + "\n" + entry.getValue().toString() + "\n";
        }
        return c;
    }
}
