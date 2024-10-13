package com.mycompany.trackhabitsapp2.db;

import com.mycompany.trackhabitsapp2.habit.HabitDB;
import com.mycompany.trackhabitsapp2.person.PersonDB;
import com.mycompany.trackhabitsapp2.password.PasswordDB;
import com.mycompany.trackhabitsapp2.email.EmailDB;
import com.mycompany.trackhabitsapp2.abstractions.AbstractEntytyDB;
import java.util.HashMap;

public class DBCreation {
    private HashMap<String, AbstractEntytyDB> DBList;
    
    public DBCreation() {
        this.DBList = new HashMap<String, AbstractEntytyDB>();
        addToDBList();
    }

    private void addToDBList() {
        DBList.put("EmailDB", new EmailDB());
        DBList.put("PasswordDB", new PasswordDB());
        DBList.put("PersonDB", new PersonDB());
        DBList.put("HabitDB", new HabitDB());
    }
    
    public AbstractEntytyDB getDB(String s) {
        //System.out.println(DBList.get(s));
        return DBList.get(s);
    }
}
