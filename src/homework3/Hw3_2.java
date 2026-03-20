package homework3;

import java.util.Scanner;

public class Hw3_2 {

    /*
Задача 2:
Найти минимальный - максимальный элементы и вывести в консоль.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите размер массива числом: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");

        }
        int min = arr[0];
        int max = arr[0];
        for (int a : arr) {
            if (a < min) {
                min = a;
            }
            if (a > max) {
                max = a;
            }
        }
        System.out.println();

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
