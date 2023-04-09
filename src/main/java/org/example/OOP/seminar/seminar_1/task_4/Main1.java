package org.example.OOP.seminar.seminar_1.task_4;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        VendMachine machineVend = new VendMachine();
        machineVend.addProduct(new ProductWater("aqua", 100.0));
        machineVend.addProduct(new Chocolate("alpa", 100.0,12));
        machineVend.addProduct(new Cips("leys",120,5));
        ArrayList list1 = machineVend.getProductBeName("leys");
        System.out.println(list1);
    }
}
