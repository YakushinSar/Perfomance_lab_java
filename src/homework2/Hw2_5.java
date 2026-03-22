package homework2;

import java.util.Scanner;

public class Hw2_5 {
    /*
Задача *:
Напишите программу, где пользователь вводит любое целое положительное
число.
А программа суммирует все числа от 1 до введенного пользователем числа. Для
ввода числа воспользуйтесь классом Scanner. Сделать проверку, чтобы
пользователь не мог ввести некорректные данные
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("введите любое целое положительное число");
        int number = s.nextInt();

        if (number <= 0) {
            System.out.println("ошибка ввода, введите любое целое положительное число");
            return;
        }

        int summa = 0;
        int i = 1;
        while (i <= number) {
            summa += i;
            i++;
        }
        System.out.println("Сумма чисел от 1 до " + number + " = " + summa);
    }
}
