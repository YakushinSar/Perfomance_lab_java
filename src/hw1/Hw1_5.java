package hw1;

public class Hw1_5 {
    /*
Задача 5:
В переменных q и w хранятся два натуральных числа. Создайте программу,
выводящую на экран результат деления q на w с остатком. Пример вывода
программы (для случая, когда в q хранится 21, а в w хранится 8):
21 / 8 = 2 и 5 в остатке.
 */
    public static void main(String[] args) {
        int q = 21;
        int w = 8;
        int result = q / w;
        int ostatok = q % w;

        System.out.println(q + " / " + w + " = " + result + " и " + ostatok + " в остатке");
    }
}
