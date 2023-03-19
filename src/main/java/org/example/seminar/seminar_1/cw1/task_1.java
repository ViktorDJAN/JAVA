package org.example.seminar.seminar_1.cw1;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Input your number: ");
        int num = a.nextInt();
        System.out.println(funk(num));
    }
    public static int funk(int n) {
        int sum = 0;
        int multy = 1;
        while(n!=0){
             sum += n%10;
             multy *= n%10;
             n = n/10;
        }
        int res = multy - sum;
        return res;
    }
}