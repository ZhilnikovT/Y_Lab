package com.mycompany.trackhabitsapp2.person;
package com.mycompany.trackhabitsapp2;

import com.mycompany.trackhabitsapp2.abstractions.AbstractEntyty;
import java.util.Date;
import java.util.Scanner;

public class Person extends AbstractEntyty {

    public Person() {
        super.setName(invitation());
        super.setNameLabel("имя");
        super.setDate(new Date());
    }
    
    public String invitation() {
        do {
            System.out.println("Введите Имя:");
            Scanner in = new Scanner(System.in);
            super.setOffer(in.nextLine());
        } while (check(super.getOffer()));
        return super.getOffer();        
    }

    public boolean check(String offer) {
        if (offer.length()>0) {
            System.out.println("продолжаем...");
            return false;
        }
        System.out.println("Неприемлимое пустое имя, пожалуйста введите больше символов!");
        return true;
    }
    
}
