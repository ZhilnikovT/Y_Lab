package com.mycompany.trackhabitsapp2.signup;

import com.mycompany.trackhabitsapp2.db.DBCreation;
import com.mycompany.trackhabitsapp2.person.Person;
import com.mycompany.trackhabitsapp2.password.Password;
import com.mycompany.trackhabitsapp2.email.Email;

public class SignUp {

    public SignUp(Email aEmail, DBCreation aDBCreation) {
        dialogue(aEmail, aDBCreation);
    }
    
    public void dialogue(Email aEmail, DBCreation aDBCreation) {
        System.out.println("Вы, по-моему у нас еще не были! Познакомимся?, ... " + aEmail.toString());
        
        Person aPerson = new Person();
        Password aPassword = new Password();
        
        aDBCreation.getDB("EmailDB").addEntyty(aEmail.getName(), aEmail);
        System.out.print(aDBCreation.getDB("EmailDB").toString());
        
        aDBCreation.getDB("PersonDB").addEntyty(aEmail.getName(), aPerson);
        System.out.print(aDBCreation.getDB("PersonDB").toString());      
        
        aDBCreation.getDB("PasswordDB").addEntyty(aEmail.getName(), aPassword);
        System.out.print(aDBCreation.getDB("PasswordDB").toString());         
    }
}
