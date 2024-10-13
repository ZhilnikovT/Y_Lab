package com.mycompany.trackhabitsapp2.email;

import com.mycompany.trackhabitsapp2.abstractions.AbstractEntyty;
import java.util.Date;
import java.util.Scanner;

public class Email extends AbstractEntyty {

    public Email() {
        super.setName(invitation());
        super.setNameLabel("e-mail");
        super.setDate(new Date());       
    }
    
    public String invitation() {
        do {
            System.out.println("Введите e-mail:");
            Scanner in = new Scanner(System.in);
            super.setOffer(in.nextLine());
        } while (check(super.getOffer()));
        return super.getOffer();
    }

    public boolean check(String offer) {
        if (offer.length()>0 && offer.contains("@") && offer.contains(".")) {
            System.out.println("продолжаем...");
            return false;
        }
        System.out.println("Неприемлимый e-mail, пожалуйста будте повнимательнее при вводе!");
        return true;
    }
    
    
}
