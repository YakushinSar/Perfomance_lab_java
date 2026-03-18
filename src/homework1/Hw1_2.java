package homework1;

public class Hw1_2 {
    /*
Задача 2:
В переменной n хранится двузначное число. Создайте программу,
вычисляющую и выводящую на экран сумму цифр n. Например: n = 26, в
результате мы должны получить 8 (2 + 6).
 */
    public static void main(String[] args) {
        int n = 26;
        int n1 = n / 10;
        int n2 = n % 10;
        int sum = n1 + n2;

        System.out.println(sum + " " + "(" + n1 + " + " + n2 + ")");
    }
}
