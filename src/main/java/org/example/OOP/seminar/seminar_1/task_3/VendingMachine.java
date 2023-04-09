package org.example.OOP.seminar.seminar_1.task_3;

import org.example.OOP.seminar.seminar_1.task_4.Chocolate;
import org.example.OOP.seminar.seminar_1.task_4.Productt;

import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<Product>list1;
    public VendingMachine(){

       list1  = new ArrayList<Product>();
    }
    public void addProduct(Product newItem){

        list1.add(newItem);
    }
    public ArrayList getProductBeName(String searcName){
        ArrayList<Product> result = new ArrayList<>();
        for(Product item: list1){
            if(item.getName().contains(searcName)){
                result.add(item);
            }
        }
        return result;
    }
    public ArrayList getProductByCost(Double searcPrice){
        ArrayList<Product> result = new ArrayList<>();
        for(Product item: list1){
            if(item.getCost().equals(searcPrice)){
                result.add(item);
            }
        }
        return result;
    }
}
