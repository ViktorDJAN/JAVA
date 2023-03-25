package org.example.seminar.seminar_3.cw_1;

import org.example.seminar.seminar_3.cw_1.model.Items;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Даны сведения об эуспортируемых товарах указывается наименование товара , страна экспортер,
 * объем товара в штуках . Найти страны которые экспортируют данных товар и общий объем экспорта.
 */

public class cw_1 {
    public static void main(String[] args) {
        Items items  = new Items("wqe0","qqq0",2.0);
        Items items1 = new Items("wqe1","www1",3.0);
        Items items2 = new Items("wqe2","eee2",3.0);
        Items items3 = new Items("wqe0","rrr3",5.0);

        List<Items> itemsList = new ArrayList<>();
        itemsList.add(items);
        itemsList.add(items1);
        itemsList.add(items2);
        itemsList.add(items3);

        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.nextLine();
        int sumVolume = 0;
        List<String> country = new ArrayList<>();

        for(int i = 0; i< itemsList.size();i++){
            if(itemsList.get(i).getName().equals(searchName)){
                sumVolume += itemsList.get(i).getVolume();
                country.add(itemsList.get(i).getCountry());
            }
        }
        System.out.println("summa =" + sumVolume);
        System.out.println(("country:" + country));

    }
}
