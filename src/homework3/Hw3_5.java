package homework3;

import java.util.Scanner;

public class Hw3_5 {

    /*
Задача 5:
Пройти по массиву и поменять местами элементы первый и последний, второй
и предпоследний и т.д.
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

        for (int i = 0; i < arr.length / 2; i++) {
            int index = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            index = arr[arr.length - 1 - i];
        }
        System.out.println();

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}