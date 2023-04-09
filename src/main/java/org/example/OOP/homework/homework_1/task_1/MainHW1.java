package org.example.OOP.homework.homework_1.task_1;
/**
 * Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 * Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
 * В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
 * Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 */

import java.util.ArrayList;

public class MainHW1 {
    public static void main(String[] args) {
        HotBevarage hotBevarage1 = new HotBevarage("tea",10.50,600);
        HotBevarage hotBevarage2 = new HotBevarage("black tea",20.0,50);
        HotBevarage hotBevarage3 = new HotBevarage("green tea",50.0,70);
        AutomatHotBaverages automatHotBaverages = new AutomatHotBaverages();

        automatHotBaverages.addHotBeverage(hotBevarage1);
        automatHotBaverages.addHotBeverage(hotBevarage2);
        ArrayList list1 = automatHotBaverages.getProduct("tea");
        ArrayList list2 = automatHotBaverages.getProduct(12.0);
        ArrayList list3 = automatHotBaverages.getProduct(50);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

    }
}
