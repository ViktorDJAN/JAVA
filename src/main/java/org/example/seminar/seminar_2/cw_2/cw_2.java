package org.example.seminar.seminar_2.cw_2;

/**
 *    Дан массив цел чисел . Найти количество пар соседних элментов шде первый элемент больше второго.
 */
public class cw_2 {
    public static void main(String[] args) {
    int[] somearr = {2,1,4,2,6,3};
        System.out.println(scan(somearr));
    }
    public static int scan(int[] array){
        int counter = 0;
        for (int i =1; i< array.length;i++){
            if(array[i-1] == array[i]*2) counter +=1;
        }
        return counter;
    }
}
