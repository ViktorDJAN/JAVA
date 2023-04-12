package org.example.OOP.homework.homework_3;

import org.example.OOP.homework.homework_2.Phones;
import org.example.OOP.homework.homework_2.TechnoShop;
import org.example.OOP.homework.homework_2.VitrinaIterator;

import java.util.ArrayList;

public class MainCl {
    public static void main(String[] args) {
        TechnoShop shop = new TechnoShop();
        ArrayList<Phones> phoneList = new ArrayList<>();
        Phones phone1 = new Phones("nokia",2000.0,"4 years","3260");
        Phones phone2 = new Phones("samsung",3000.0,"3 years","9s");
        Phones phone3 = new Phones("nokia",4000.0,"2 years","9a");
        VitrinaIterator vitrinaIterator = new VitrinaIterator(0,phoneList);
        phoneList.add(phone1);
        phoneList.add(phone2);
        phoneList.add(phone3);
        System.out.println("AVAILABLE PHONES  ARE SPECIFIED BELOW");
        while (vitrinaIterator.hasNext()){
            System.out.println(vitrinaIterator.next().toString());
        }
    }
}
