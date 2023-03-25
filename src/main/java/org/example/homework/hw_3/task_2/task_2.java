package org.example.homework.hw_3.task_2;

import org.example.homework.hw_3.task_2.especial2.Goods2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class task_2 {
    public static void main(String[] args) {
        Goods2 goods1 = new Goods2("commodity1","countryA",10.0,100.0,"first");
        Goods2 goods2 = new Goods2("commodity2","countryB",20.0,200.0,"second");
        Goods2 goods3 = new Goods2("commodity3","countryC",30.0,250.0,"first");
        Goods2 goods4 = new Goods2("commodity4","countryD",40.0,101.0,"second");
        Goods2 goods5 = new Goods2("commodity5","countryE",50.0,300.0,"first");
        Goods2 goods6 = new Goods2("commodity6","countryF",60.0,320.0,"second");

        List<Goods2>goods2List = new ArrayList<>();
        goods2List.add(goods1);
        goods2List.add(goods2);
        goods2List.add(goods3);
        goods2List.add(goods4);
        goods2List.add(goods5);
        goods2List.add(goods6);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter which sort do you need: ");
        String seachName = scanner.nextLine();

        for(int i = 0; i<goods2List.size();i++){
            double minPrice = goods2List.get(1).getPrice();
            if(goods2List.get(i).getPrice()< minPrice && goods2List.get(i).getSort().equals(seachName)){
                minPrice = goods2List.get(i).getPrice();
                System.out.println(goods2List.get(i).getName());
            }

        }

    }
}
