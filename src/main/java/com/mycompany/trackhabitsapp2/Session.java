package com.mycompany.trackhabitsapp2;

import com.mycompany.trackhabitsapp2.habit.Habit;
import com.mycompany.trackhabitsapp2.db.DBCreation;
import com.mycompany.trackhabitsapp2.email.Email;
import static java.lang.System.in;
import java.util.Scanner;

public class Session {

    public Session(Email aEmail, DBCreation aDBCreation) {
        session(aEmail, aDBCreation);
    }

    Session() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void session(Email aEmail, DBCreation aDBCreation) {
        String str;
        do {
            Habit aHabit= new Habit();
            aDBCreation.getDB("HabitDB").addEntyty(aEmail.getName(), aHabit);
            System.out.print(aDBCreation.getDB("HabitDB").toString());
            
            System.out.println("Хотите нас покинуть? Введите: да или нет");
            Scanner in = new Scanner(System.in);
            str = in.nextLine();
            if (str.equals("нет")) break;
        } while (true == true);
    }
}
