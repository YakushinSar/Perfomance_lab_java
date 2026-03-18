package homework2;

import java.util.Scanner;

public class Hw2_1 {

    /*
Задача 1:
Напишите программу, которая будет принимать на вход число из консоли и на
выход будет выводить сообщение четное число или нет. Для определения
четности числа используйте операцию получения остатка от деления (операция
выглядит так: '% 2').
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Число " + number + " четное");
        } else {
            System.out.println("Число " + number + " не четное");
        }
    }
}
