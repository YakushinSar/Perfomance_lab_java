package homework7;

public class Hw7_1 extends MainMethod {
    /*
Задача 1:
Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
     */
    public static void main(String[] args) {
        String str1 = input("Введите первую строку: ");
        String str2 = input("Введите вторую строку: ");
        String str3 = input("Введите третью строку: ");
        String[] arraySting = {str1, str2, str3};

        String max = arraySting[0];
        String min = arraySting[0];
        for (String s : arraySting) {
            if (s.length() > max.length()) {
                max = s;
            }
            if (s.length() < min.length()) {
                min = s;
            }
        }
        System.out.println("самая длинная строка - ".concat(max).concat(" её длина - ").concat(String.valueOf(max.length())));
        System.out.println("самая короткая строка - ".concat(min).concat(" её длина - ").concat(String.valueOf(min.length())));
    }
}