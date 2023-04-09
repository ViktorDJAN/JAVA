package org.example.java_Introducion.homework.hw_2.task_4;

/**
 * 3) Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
 */

import java.util.Arrays;

public class task_4 {
    public static void main(String[] args) {

        int[] arr = {1, 3, 99, 10, -4, -5, -77, 9, 8};
        int[] copyarr = new int[arr.length];
        for (int i = 0; i < copyarr.length; i++) {
            copyarr[i]=arr[i];
        }
        int zamena = numb(arr);
        for (int j = 0; j< copyarr.length;j++){
            if(copyarr[j]<0) copyarr[j] = zamena;
        }
        System.out.println(Arrays.toString(copyarr));

    }


    public static int numb(int[] somear) {
        int summa = 0;
        for (int i = 0; i < somear.length; i++) {
            int k = 0;
            while (somear[i] != 0) {
                k += 1;
                somear[i] = somear[i] / 10;
            }
            if (k == 2) summa += i;
        }
        return summa;
    }
}
