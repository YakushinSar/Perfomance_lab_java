package homework7;

public class Hw7_5 extends MainMethod {
    /*
Задача 5:Вывести на консоль новую строку, которой задублирована каждая буква из начальной строки. Например, "Hello" -> "HHeelllloo"
    */
    public static void main(String[] args) {
        String str1 = input("Введите строку: ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            sb.append(c).append(c);
        }
        System.out.println(sb);
    }
}
