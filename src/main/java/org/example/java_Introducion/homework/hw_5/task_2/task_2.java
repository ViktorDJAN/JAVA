package org.example.java_Introducion.homework.hw_5.task_2;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;


/**
 *  Подсчитать количество искомого слова, через map (наполнением значение,
 *  где искомое слово будет являться ключом), вносить все слова не нужно
 */
public class task_2 {
    public static void main(String[] args) {
        System.out.println("enter string: ");
        Scanner seek = new Scanner(System.in);
        String str1 = seek.nextLine();
        Map<String, Integer> mark = new HashMap<>();
        mark.put("-", 1);
        mark.put(".", 1);
        String sent = "Россия идет впереди всей планеты. Планета это не Россия. Это и это и это";
        sent = sent.toLowerCase(Locale.ROOT);
        System.out.println(sent);
        Map<String, Integer> word = new HashMap<>();
        String[] s1 = (sent + " ").split("\\p{P}?[ \\t\\n\\r]+");
        for (int i = 0; i < s1.length; i++) {
            if ((!word.containsKey(s1[i]))) {
                word.put(s1[i], 1);
            } else {
                word.put(s1[i], word.get(s1[i]) + 1);
            }
        }
        for (var entry : word.entrySet()) {
            if (entry.getKey().equals(str1)) {

                System.out.println(entry.getKey()+ " -----  " + entry.getValue());

            }
        }
    }
}
