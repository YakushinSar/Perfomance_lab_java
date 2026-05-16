package homework8;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Hw8_1 {
    /*
    Задача 1:
Пользователь вводит набор чисел в виде одной строки с клавиатуры.
Например: "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке.
Вывести результат на экран. При решении использовать коллекции.
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите несколько чисел через пробел в одну строку");
        String line = sc.nextLine();
        String[] parts = line.split(" ");

        Set<String> set = new TreeSet<>();
        for (String s : parts) {
            set.add(s);
        }
        System.out.println(set);
    }
}
