package org.example.java_Introducion.homework.hw_4.task_1;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 * Пример:
 * 1 -> 2->3->4
 * Вывод:
 * 4->3->2->1
 */
public class task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> someList = new LinkedList<>(Arrays.asList(1,2,3,4));
        LinkedList<Integer> revLinkedList = new LinkedList<Integer>();
        System.out.println(someList);
        for(int i = someList.size()-1;i>=0;i--){

            revLinkedList.add(someList.get(i));
        }
        System.out.println(revLinkedList);
    }
}
