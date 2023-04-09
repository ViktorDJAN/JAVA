package org.example.java_Introducion.homework.hw_2.task_3;

/**
 * 2) Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
 */

public class task_3 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,98,101,1000};
        System.out.println(check(arr));

    }
    public static boolean check(int [] somear){
        int firstnum = somear[0];
        for (int i = 1;i< somear.length;i++){
            if(somear[i]< firstnum) return false;
            firstnum = somear[i];
        }
        return true;
    }

}
