package org.example.homework.hw_1;

import java.util.Scanner;


//Example 1:
//
//        Input: s = "the sky is blue"
//        Output: "blue is sky the"


public class homework_1 {
    public static void main(String[] args) {
        System.out.println("enter string: ");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] words = str.split(" ");
        String[] arr = new String[words.length];
        String aa = " ";
        for(int i = words.length-1; i+1 > 0;i--){
            if(words[i]!="\\s+") aa+= " " +words[i];
        }
        System.out.print(aa.trim());
    }
}

