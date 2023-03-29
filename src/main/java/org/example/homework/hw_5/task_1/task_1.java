package org.example.homework.hw_5.task_1;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * 1) Подсчитать количество вхождения каждого слова
 * Пример:
 * Россия идет вперед всей планеты. Планета — это не Россия.
 * toLoverCase().
 * (Усложнение - игнорировать пунктуацию)*
 */

public class task_1 {
    public static void main(String[] args) {
        Map<String, Integer> mark = new HashMap<>();
        mark.put("-", 1);
        mark.put(".", 1);
        String sent = "Россия идет впереди всей планеты. Планета это не Россия. Это и это и это";
        sent = sent.toLowerCase(Locale.ROOT);
        System.out.println(sent);
        Map<String, Integer> word = new HashMap<>();
        String[] s1 = (sent + " ").split("\\p{P}?[ \\t\\n\\r]+");
        for (int i = 0; i < s1.length; i++) {
            if ((!word.containsKey(s1[i])) ) {
                word.put(s1[i], 1);
            } else {
                word.put(s1[i], word.get(s1[i]) + 1);
            }
        }
        for (var entr : word.entrySet()) {
            System.out.println(entr.getKey() + " -----  " + entr.getValue());
        }
    }
}
