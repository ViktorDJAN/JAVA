package org.example.seminar.seminar_5.cw_3;

import java.util.HashMap;
import java.util.Map;

public class cw_3 {
    public static void main(String[] args) {
        Map <Character,Integer> trans = new HashMap<>();
        trans.put('I',1);
        trans.put('V',5);
        trans.put('X',10);
        trans.put('L',50);
        trans.put('C',100);
        trans.put('D',500);
        trans.put('M',1000);

        String s1 = "LVIIX";
        int sum = trans.get(s1.charAt(s1.length()-1));
        for(int i = 0; i<s1.length()-1;i++){
            if(trans.get(s1.charAt(i)) < trans.get(s1.charAt(i+1))){
                sum -= trans.get(s1.charAt(i));
            }
            else {
                sum+=trans.get(s1.charAt(i));
            }
        }
        System.out.println(sum);
    }

}
