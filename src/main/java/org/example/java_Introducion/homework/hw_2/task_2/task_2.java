package org.example.java_Introducion.homework.hw_2.task_2;

/**
 * 1) Дана последовательность N целых чисел. Найти сумму простых чисел.
 */

public class task_2 {
    public static void main(String[] args) {
        int[] somearr = {2, 4, 101, 101, 24, 26, 2, 211, 386,2,211,25};
        System.out.println(numsimple(somearr));
    }

    public static int numsimple(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int k = 0;
            for (int j = 1; j <= arr[i]; j += 1) {
                if (arr[i] % j == 0) k += 1;
            }
            if (k == 2) sum+=arr[i];
        }
        return sum;
    }
}
