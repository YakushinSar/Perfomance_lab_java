package hw1;

public class Hw1_3 {
    /*
Задача 3:
В переменной n хранится трёхзначное число. Создайте программу,
вычисляющую и выводящую на экран сумму цифр n. Например: n = 126, в
результате мы должны получить 9 (1+2+6).
 */
    public static void main(String[] args) {
        int n = 126;
        int n1 = n / 100;
        int n2 = (n / 10) % 10;
        int n3 = n % 10;
        int sum = n1 + n2 + n3;

        System.out.println(sum + " (" + n1 + "+" + n2 + "+" + n3 + ")");
    }
}
