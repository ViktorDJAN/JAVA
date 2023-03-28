package org.example.seminar.seminar_4.cw_3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Удалить все отрицательный элемент из списка
 */
public class cw_3 {
    public static void main(String[] args) {
        List<Integer> someList = new LinkedList<>(Arrays.asList(1,-2,-3,-4,-5,6,-7,8,9));
        System.out.println(someList);
        System.out.println();
        seek(someList);
        System.out.println(someList);
        System.out.println();
        seekNegation(someList);
        System.out.println(someList);
    }

    /**
     *
     * @param someList исходный список значений
     * @return изменненый список значений
     */
    private static List<Integer> seek(List<Integer> someList){

        for(int i = 0; i<someList.size();i++){
            if(someList.get(i) <0) {
                someList.remove(i);
                i=i-1;  // это нужно делоть обязательно так как у нас походу программы меняется длина списка , чтобы
                        // не было никаких перескоков
            }
        }
        return someList;
    }

    private static List<Integer> seekNegation(List<Integer> someList){

        for(int i = someList.size()-1; i>=0;i--){
            if(someList.get(i) <0) {
                someList.remove(i);
            }
        }
        return someList;
    }
}
