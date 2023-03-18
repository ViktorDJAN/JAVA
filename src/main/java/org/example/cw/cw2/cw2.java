package org.example.cw.cw2;

import java.util.Scanner;

public class cw2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String sub1 = str.substring(0,str.length()/2);
        String sub2 = str.substring(str.length()/2);
        System.out.println(sub2 + " " + sub1);


    }
}
