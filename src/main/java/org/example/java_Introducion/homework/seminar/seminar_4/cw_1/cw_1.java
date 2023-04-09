package org.example.java_Introducion.homework.seminar.seminar_4.cw_1;

import java.util.Arrays;
import java.util.LinkedList;

public class cw_1 {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        int summa = 0;
        for (int i = 0; i<integerLinkedList.size();i++){
            if(integerLinkedList.get(i) %2 ==0 ) summa += integerLinkedList.get(i);
        }
        System.out.println(summa);
    }
}


