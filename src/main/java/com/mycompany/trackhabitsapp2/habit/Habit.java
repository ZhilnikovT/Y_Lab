package com.mycompany.trackhabitsapp2.habit;

import com.mycompany.trackhabitsapp2.abstractions.AbstractEntyty;
import java.util.Date;
import java.util.Scanner;

public class Habit extends AbstractEntyty {
    
    public Habit() {
        super.setName(invitation());
        super.setNameLabel("привычка");
        super.setSpecification(specification());
        super.setSpecificationLabel("описание привычки");
        super.setValue(value());
        super.setValueLabel("частота привычки");                 
        super.setDate(new Date());
    }
    
    public String invitation() {
        do {
            System.out.println("Введите Наименование Привычки:");
            Scanner in = new Scanner(System.in);
            super.setOffer(in.nextLine());
        } while (check(super.getOffer()));
        return super.getOffer();        
    }

    public String specification() {
        do {
            System.out.println("Введите Описание Привычки:");
            Scanner in = new Scanner(System.in);
            super.setOffer(in.nextLine());
        } while (check(super.getOffer()));
        return super.getOffer();        
    }
    
    public String value() {
        do {
            System.out.println("Введите Частоту Привычки:");
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
        System.out.println("Неприемлимое пустое наименование привычки, пожалуйста введите больше символов!");
        return true;
    }
    
}
