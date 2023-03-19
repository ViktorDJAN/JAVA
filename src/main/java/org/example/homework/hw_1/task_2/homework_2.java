package org.example.homework.hw_1.task_2;

import java.util.Scanner;
//2) Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
//        Пример ввода:
//        1 2 1 2 -1 1 3 1 3 -1 0
//        Логика расчета:
//        2 -1 переход -> 2 в сумму
//        3 -1 переход -> 3 в сумму


public class homework_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        int a = sc.nextInt();
        for(int i = 0;i<n;i++){
            int b = sc.nextInt();
            if(b!=a && b<0) k+=a;
        a = b;
        }
        System.out.print(k);
    }
}
