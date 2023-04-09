package org.example.OOP.homework.homework_1.task_1;

import java.util.ArrayList;

// Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод
// getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
public class AutomatHotBaverages implements TradeAutomat{
    private ArrayList<HotBevarage> list1;

    public AutomatHotBaverages() {
        list1 = new ArrayList<>();
    }

    public void addHotBeverage(HotBevarage item) {
        list1.add(item);
    }

    public ArrayList<HotBevarage> getProduct(String searchByName) {
        ArrayList<HotBevarage> result = new ArrayList<>();
        for (HotBevarage item : list1) {
            if ((item.getName().contains(searchByName))) {
                result.add(item);
            }
        }
        return result;
    }

    public ArrayList<HotBevarage> getProduct(Double searchByPrice) {
        ArrayList<HotBevarage> result = new ArrayList<>();
        for (HotBevarage item : list1) {
            if ((item.getPrice()>=(searchByPrice))) {
                result.add(item);
            }
        }
        return result;
    }
    public ArrayList<HotBevarage> getProduct(Integer searchByTemperature) {
        ArrayList<HotBevarage> result = new ArrayList<>();
        for (HotBevarage item : list1) {
            if ((item.getTemperature()>=(searchByTemperature))) {
                result.add(item);
            }
        }
        return result;
    }
}
