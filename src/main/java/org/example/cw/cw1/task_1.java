package org.example.cw.cw1;

import java.util.Scanner;
public class task_1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Input your number: ");
        int num = a.nextInt();
        int a1 = num/100;
        int a2 = num%100/10;
        int a3 = num%10;
        int act1 = a1*a2*a3;
        int act2 = a1+a2+a3;
        int res = act1-act2;
        System.out.println(res);
    }
}