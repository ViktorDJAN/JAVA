package org.example.java_Introducion.homework.hw_4.task_2;

import java.util.LinkedList;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * * An input string is valid if:
 * * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 */
public class task_2 {
    public static void main(String[] args) {
        String text1 = "[]";
        String text2 = "()[]{}";
        String text3 = "(]";
        System.out.println(seek(text1));
        System.out.println(seek(text2));
        System.out.println(seek(text3));
    }

    public static Boolean seek(String word) {
        LinkedList<String> check = new LinkedList<>();
        String[] arr = word.split("");
        Boolean flag = false;
        int coun1 = 0;
        int coun2 = 0;
        int coun3 = 0;
        for(int i = 0; i < arr.length;i++){
            if(arr[i].equals("(")) coun1 +=1;
            if((arr[i].equals(")")) && (!arr[i].equals("(")) && (!arr[i].equals("[")) && (!arr[i].equals("]")) &&
                    (!arr[i].equals("{")) && (!arr[i].equals("}"))) coun1 +=1;
            if(coun1 ==2) flag = true;

            if(arr[i].equals("[")) coun2 +=1;
            if((arr[i].equals("]")) && (!arr[i].equals("(")) && (!arr[i].equals(")")) && (!arr[i].equals("[")) &&
                    (!arr[i].equals("{")) && (!arr[i].equals("}"))) coun2 +=1;
            if(coun2 ==2) flag = true;

            if(arr[i].equals("{")) coun3 +=1;
            if((arr[i].equals("}")) && (!arr[i].equals("{")) && (!arr[i].equals(")")) && (!arr[i].equals("(")) &&
                    (!arr[i].equals("[")) && (!arr[i].equals("]"))) coun3 +=1;
            if(coun3 ==2) flag = true;

        }

        return flag;
    }
}

