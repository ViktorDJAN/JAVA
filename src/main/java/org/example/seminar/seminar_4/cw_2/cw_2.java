package org.example.seminar.seminar_4.cw_2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class cw_2 {
    public static void main(String[] args) {
        List<Integer> someList = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(someList);
        System.out.println();
        solution(someList);
        System.out.println(someList);
    }

    /**
     *
     * @param someList исходный список значений
     * @return изменненый список значений
     */
    private static List<Integer> solution(List<Integer> someList){
        int counter = 0;
        for(Integer el : someList){
            if(el%2!=0){
                counter += el;
            }
        }
        for(int i = 0; i<someList.size();i++){
            if(someList.get(i)%3 !=0) {
                someList.set(i,counter);
            }
        }
        return someList;
    }
}

