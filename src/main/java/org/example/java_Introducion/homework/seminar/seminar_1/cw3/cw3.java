package org.example.java_Introducion.homework.seminar.seminar_1.cw3;



import java.util.Scanner;
import java.util.Arrays;

public class cw3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("enter your num: ");
        int num = a.nextInt();
        System.out.println(num);
        System.out.println(Arrays.toString(getar(num)));
        System.out.println((check(getar(num))));

    }

    public static int[] getar(int n) {

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter n: ");
            Scanner a = new Scanner(System.in);
            arr[i] = a.nextInt();
        }
        return arr;
    }

    public static boolean check(int[] array) {
        boolean f  = false;
        for(int i = 0; i<(array.length)/2;i++){
            if(array[i] != array.length-i-1) return f;
        }
        return true;
    }
}




//       System.out.println(Arrays.toString(arr))