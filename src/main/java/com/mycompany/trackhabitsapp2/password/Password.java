package com.mycompany.trackhabitsapp2.password;

import com.mycompany.trackhabitsapp2.abstractions.AbstractEntyty;
import java.util.Date;
import java.util.Scanner;

public class Password extends AbstractEntyty {

    public Password() {
        super.setName(invitation());
        super.setNameLabel("пароль");
        super.setDate(new Date());
    }

    public String invitation() {
        do {
            System.out.println("Введите вариант пароля:");
            Scanner in = new Scanner(System.in);
            super.setOffer(in.nextLine());
        } while (check(super.getOffer()));
        return super.getOffer();
    }

    private boolean check(String offer) {
        if (offer.length()>0) {
            System.out.println("Приемлимый вариант для пароля");
            return false;
        }
        System.out.println("Неприемлимый вариант для пароля, предложите другой с большим количеством символов....");
        return true;
    }
    
}
