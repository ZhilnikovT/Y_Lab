package com.mycompany.trackhabitsapp2;

import com.mycompany.trackhabitsapp2.db.DBCreation;
import com.mycompany.trackhabitsapp2.signup.SignUp;
import com.mycompany.trackhabitsapp2.signin.SignIn;
import com.mycompany.trackhabitsapp2.email.Email;


public class Main {

    public static void main(String[] args) {

        DBCreation aDBCreation = new DBCreation();

        while(true == true) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("Здравствуйте! Вы посетили ПРИЛОЖЕНИЕ ДЛЯ ОТСЛЕЖИВАНИЯ ПРИВЫЧЕК");
            System.out.println("Вы, у нас уже были? Разрешите я уточню, для это ....");

            Email aEmail = new Email();

            if (aDBCreation.getDB("EmailDB").IsKeyContained(aEmail.getName())) {
                SignIn aSignIn = new SignIn(aEmail, aDBCreation);
            } else {
                SignUp aSignUp = new SignUp(aEmail, aDBCreation);
            }
            Session aSession = new Session(aEmail, aDBCreation);

        }
        



        
    }
}