package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Hw3_1 {

    /*
Задача 1:
Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите размер массива числом: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        Arrays.sort(arr);

        for (int ar : arr) {
            System.out.print(ar + " ");
        }
        System.out.println();

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
