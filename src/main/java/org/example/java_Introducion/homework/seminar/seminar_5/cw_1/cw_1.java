package org.example.java_Introducion.homework.seminar.seminar_5.cw_1;

import java.util.*;

/**
 *  Count the quantity of the text enterance
 */
public class cw_1 {
    public static void main(String[] args) {
        Map<Character,Integer> mapCH = new HashMap<>();
        String str = "qqqqwwweeerrreewewrq";
        for(int i = 0;i<str.length();i++){
            if(!mapCH.containsKey(str.charAt(i))){
                mapCH.put(str.charAt(i),1);
            }
            else {
                mapCH.put(str.charAt(i),mapCH.get(str.charAt(i))+1);
            }
        }
        for(var entry: mapCH.entrySet()){
            System.out.println(entry.getKey() +" -  "+ entry.getValue());
        }
    }

}
//    mapCH.putIfAbsent(str.charAt(i),1);
//    mapCH.put(str.charAt(i),mapCH.get(str.charAt(i))+1);