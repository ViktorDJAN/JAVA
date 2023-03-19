package org.example.seminar.seminar_2.cw_1;

// Дана последовательность из  Н чисел найти сумму чисел оканчивающихся на  5   перед которыми идет четное число.
import java.util.Scanner;
public class cw_1 {
    public static void main(String[] args) {
        System.out.println(sum5());
    }
    public static int sum5(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter quantity numbers: ");
        int counter = 0;
        int n = sc.nextInt();
        int num = sc.nextInt();
        for(int i = 0;i<n;i++){
            int nextnum = sc.nextInt();
            if(num%10==5 && nextnum%2 ==0) counter+=num;
            num = nextnum;
        }
        return counter;
    }
}
