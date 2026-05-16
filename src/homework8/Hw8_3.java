package homework8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Hw8_3 {
    /*
    Задача 3:
    На вход поступает массив строк, верните Map<String, Boolean>, где каждая
    отдельная строка является ключом, и ее значение равно true, если эта строка
    встречается в массиве 2 или более раз. Пример:
    wordMultiple(["a", "b", "a", "c", "b"])→{"a": true, "b": true, "c": false}
    wordMultiple(["c", "b", "a"])→{"a": false, "b": false, "c": false}
    wordMultiple(["c", "c", "c", "c"])→{"c": true}
     */
    static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Integer> countMap = new HashMap<>();
        Map<String, Boolean> resultMap = new LinkedHashMap<>();

        for (String s : strings) {
            if (countMap.containsKey(s)) {
                countMap.put(s, countMap.get(s) + 1);
            } else {
                countMap.put(s, 1);
            }
        }

        for (String s : strings) {
            if (countMap.get(s) >= 2) {
                resultMap.put(s, true);
            } else {
                resultMap.put(s, false);
            }
        }
        return resultMap;
    }

    public static void main(String[] args) {
        String[] arr1 = {"a", "b", "a", "c", "b"};
        String[] arr2 = {"c", "b", "a"};
        String[] arr3 = {"c", "c", "c", "c"};

        System.out.println(wordMultiple(arr1));
        System.out.println(wordMultiple(arr2));
        System.out.println(wordMultiple(arr3));
    }
}
