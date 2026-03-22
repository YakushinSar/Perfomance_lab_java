package homework3;

import java.util.Scanner;

public class Hw3_3 {

    /*
Задача 3:
Найти индексы минимального и максимального элементов и вывести в консоль.
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

        int minInd = 0;
        int maxInd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[minInd]) {
                minInd = i;
            }
            if (arr[i] > arr[maxInd]) {
                maxInd = i;
            }
        }
        System.out.println();
        System.out.println("индекс мин числа - " + minInd);
        System.out.println("индекс макс числа - " + maxInd);
    }
}
