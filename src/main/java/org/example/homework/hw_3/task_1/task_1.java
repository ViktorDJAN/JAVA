package org.example.homework.hw_3.task_1;

import org.example.homework.hw_3.task_1.especial.Goods;

import java.util.ArrayList;
import java.util.List;


/**
 *  Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену товаров 1го или 2го сорта среди товаров,
 *  название которых содержит «высший».
 */


public class task_1 {
    public static void main(String[] args) {

        Goods goods1 = new Goods("flour middle", 1500, "first");
        Goods goods2 = new Goods("flour highest", 3000, "first");
        Goods goods3 = new Goods("flour inferior", 500, "first");
        Goods goods4 = new Goods("flour highest", 2000, "second");
        Goods goods5 = new Goods("flour highest", 2500, "second");

        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(goods1);
        goodsList.add(goods2);
        goodsList.add(goods3);
        goodsList.add(goods4);
        goodsList.add(goods5);

        int max1 = 0;
        int max2 = 0;

        for (int i = 0; i < goodsList.size(); i++) {
            if (goodsList.get(i).getName().contains("highest") && goodsList.get(i).getPrice() > max1
                    && goodsList.get(i).getSort().equals("first")) {
                max1 = goodsList.get(i).getPrice();
            }
        }
        System.out.println("the highest commodity price of first sort = " + max1);
        for (int i = 0; i < goodsList.size(); i++) {
            if (goodsList.get(i).getName().contains("highest") && goodsList.get(i).getPrice() > max2
                    && goodsList.get(i).getSort().equals("second")) {
                max2 = goodsList.get(i).getPrice();
            }
        }
        System.out.println("the highest commodity price of second sort = " + max2);
    }
}
