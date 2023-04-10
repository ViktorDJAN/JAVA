package org.example.OOP.homework.homework_2;

import java.util.ArrayList;

public class TechnoShop {
    private ArrayList<ElectronicDevice> list;
    public TechnoShop(){
        list = new ArrayList<>();
    }
    public void addDevice(ElectronicDevice device){
        list.add(device);
    }
    public ArrayList<ElectronicDevice> getDeviceByName(String searchPrmtr){
        ArrayList<ElectronicDevice> result = new ArrayList<>();
        for(ElectronicDevice item : list){
            if(item.getName().contains(searchPrmtr)){
                result.add(item);
            }
        }
        return result;
    }
}
