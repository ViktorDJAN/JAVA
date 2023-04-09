package org.example.java_Introducion.homework.hw_3.task_3;
/**
 * Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц. Найти названия книг,
 * в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */

import org.example.java_Introducion.homework.hw_3.task_3.especial3.Goods3;

import java.util.ArrayList;
import java.util.List;

public class task_3 {
    public static void main(String[] args) {
        Goods3 goods1 = new Goods3("namebookA","lastnameA",150.0,1990,100);
        Goods3 goods2 = new Goods3("namebookB","lastnameAB",200.0,2092,101);
        Goods3 goods3 = new Goods3("namebookC","lastnameC",220.0,1991,160);
        Goods3 goods4 = new Goods3("namebookD","lastnameAAaA",320.0,2095,103);
        Goods3 goods5 = new Goods3("namebookE","lastnameE",410.0,1994,300);
        Goods3 goods6 = new Goods3("namebookF","lastnameF",500.0,1997,107);

        List<Goods3>goods3List = new ArrayList<>();
        goods3List.add(goods1);
        goods3List.add(goods2);
        goods3List.add(goods3);
        goods3List.add(goods4);
        goods3List.add(goods5);
        goods3List.add(goods6);

        int[] arr = new int[1000];
        List<Integer> array = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int k = 0;
            for (int j = 1; j <= arr[i]; j += 1) {
                if (arr[i] % j == 0) k += 1;
            }
            if ((k == 2)&& arr[i] != 0 ) array.add(arr[i]) ;
        }
//        System.out.println(array);
//        boolean equalLists = listA.size() == listB.size() && listA.containsAll(listB);
        for(int i = 0;i<goods3List.size();i++){
            for(int j = 0;j< array.size();j++)
                if((goods3List.get(i).getPagesQuantity() == array.get(j)) &&
                        (goods3List.get(i).getAuthorLastname().contains("A"))&&(goods3List.get(i).getYearIssue()>=2010)){

                System.out.println(goods3List.get(i).getName());
            }
        }

    }
}
