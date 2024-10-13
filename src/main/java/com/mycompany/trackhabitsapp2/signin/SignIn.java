package com.mycompany.trackhabitsapp2.signin;

import com.mycompany.trackhabitsapp2.db.DBCreation;
import com.mycompany.trackhabitsapp2.signup.SignUp;
import com.mycompany.trackhabitsapp2.person.Person;
import com.mycompany.trackhabitsapp2.password.Password;
import com.mycompany.trackhabitsapp2.email.Email;

public class SignIn {

    public SignIn(Email aEmail, DBCreation aDBCreation) {
        System.out.println("Да, по-моему Вы уже были! Еще одна пустая формальность...");
        Password aPassword = new Password();
       
        String passwordFromBD = aDBCreation.getDB("PasswordDB").lastInListForTheKey(aEmail.getName()).getName();
        String passwordFromCnsl = aPassword.getName();
        if (passwordFromBD.equals(passwordFromCnsl))  {
            System.out.println("Пароль верный, как сегодня к вам обращаться?...");
            
            Person aPerson = new Person();
            String personFromBD = aDBCreation.getDB("PersonDB").lastInListForTheKey(aEmail.getName()).getName();
            String personFromCnsl = aPerson.getName();
            
            if (personFromBD.equals(personFromCnsl)) {
                System.out.println("Понятно, у Вас без изменений, обращаемся как и прежде...");
            } else {
                System.out.println("У Вас поменялось обращение? Познакомимся заново...");
                SignUp aSignUp = new SignUp(aEmail, aDBCreation);
            }
        } else {
            // неправельный пароль или второй шанс или сменить 
            System.out.println("Пароль не верный. Хотите его поменять? Тогда познакомимся заново...");
            SignUp aSignUp = new SignUp(aEmail, aDBCreation);
        }
        
        
        
        
        /*
        if (aDBCreation.getDB("PasswordDB").lastInListForTheKey(aEmail.getName()).toString()
                lastInListForTheKey(aEmail.getName()).
                
                aPasswordDB.isValid(aEmail, aPassword)) {
            System.out.println("Пароль верный, как сегодня к вам обращаться?...");
            Person aPerson = new Person();
            if (aPersonDB.isValid(aEmail, aPerson)) {
                System.out.println("Понятно, обращаемся как и прежде...");
            } else {
                System.out.println("У Вас поменялось обращение? Познакомимся заново...");
                SignUp aSignUp = new SignUp(aEmail, aEmailDB, aPasswordDB, aPersonDB);
            }
        } else {
            // неправельный пароль или второй шанс или сменить 
        }
*/
        
    }
    
}
