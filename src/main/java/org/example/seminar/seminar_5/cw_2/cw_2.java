package org.example.seminar.seminar_5.cw_2;

import java.util.HashMap;
import java.util.Map;

public class cw_2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(search(arr));
    }
    private static boolean search(int[] arr){
        Map<Integer,Integer> test = new HashMap<>();
        for (int i = 0;i< arr.length;i++){
            if(test.containsKey(arr[i])){
                return false;
            }
            else {
                test.put(arr[i],1);
            }

        }
        return true;
    }
}
