package org.example.OOP.homework.homework_2;

import java.util.ArrayList;

public class MainCl {
    public static void main(String[] args) {
        TechnoShop shop = new TechnoShop();
        Phones phone1 = new Phones("nokia",2000.0,"4 years","3260");
        Phones phone2 = new Phones("samsung",3000.0,"3 years","9s");
        Phones phone3 = new Phones("nokia",4000.0,"2 years","9a");
        Notbook notbook1 = new Notbook("acer",10000.0,"3years","22a");
        Notbook notbook2= new Notbook("lenovo",15000.0,"2years","2b");
        Notbook notbook3 = new Notbook("lenovo",12000.0,"1years","26ca");
        shop.addDevice(phone1);
        shop.addDevice(phone2);
        shop.addDevice(phone3);
        shop.addDevice(notbook1);
        shop.addDevice(notbook2);
        shop.addDevice(notbook3);
        ArrayList list1 = shop.getDeviceByName("lenovo");
        System.out.println(list1);
    }
}
