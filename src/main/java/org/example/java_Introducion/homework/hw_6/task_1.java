package org.example.java_Introducion.homework.hw_6;

import org.example.java_Introducion.homework.hw_6.model.Notebook;

import java.util.*;

/**
 * Задание на дом :
 * • Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 * • Создать множество ноутбуков.
 * • Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
 * отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 * “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 * • Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
 * • Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */


public class task_1 {
    public static void main(String[] args) {
        Notebook nb1 = new Notebook("hp", 4, 500, "linux", "black");
        Notebook nb2 = new Notebook("asus", 4, 400, "windows", "white");
        Notebook nb3 = new Notebook("acer", 4, 1000, "windows", "grey");
        Notebook nb4 = new Notebook("asus", 8, 1000, "windows", "black");
        Notebook nb5 = new Notebook("acer", 16, 300, "mcos", "green");
        Notebook nb6 = new Notebook("hp", 8, 500, "windows", "green");
        Notebook nb7 = new Notebook("hp", 32, 300, "mcos", "black");
        Notebook nb8 = new Notebook("asus", 8, 200, "windows", "white");
        Notebook nb9 = new Notebook("acer", 16, 300, "linux", "grey");
        Notebook nb10 = new Notebook("lenovo", 32, 500, "windows", "white");
        List<Notebook> notebookList = new ArrayList<>();
        notebookList.add(nb1);
        notebookList.add(nb2);
        notebookList.add(nb3);
        notebookList.add(nb4);
        notebookList.add(nb5);
        notebookList.add(nb6);
        notebookList.add(nb7);
        notebookList.add(nb8);
        notebookList.add(nb9);
        notebookList.add(nb10);
        Notebook[] notebooks = {nb1, nb2, nb3,nb4,nb5,nb6,nb7,nb8,nb9,nb10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите имя");
        String name = scanner.nextLine();

        System.out.println("введите озу");
        int ozu = scanner.nextInt();

        System.out.println("введите хард диск");
        int hd = scanner.nextInt();



      System.out.println(arr(notebooks,name,ozu,hd));


    }

    private static ArrayList arr(Notebook[] ar, String name,int ozu,int hd) {
        ArrayList<Notebook> notebookArr = new  ArrayList<>();
        for (Notebook ar1 : ar) {
            if ((ar1.getName().equals(name)) && (ar1.getOzu()>=(ozu)) && ar1.getHdValue()>=(hd)){
                notebookArr.add(ar1);
            }
        }
        return notebookArr;

    }
}



