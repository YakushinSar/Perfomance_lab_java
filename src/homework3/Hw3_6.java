package homework3;

import java.util.Scanner;

public class Hw3_6 {

    /*
Задача 6:
Проверить, является ли массив возрастающей последовательностью (каждое
следующее число больше предыдущего).
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
//        int[] arr = {1, 2, 3, 4, 5, 6};

        boolean a = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                a = false;
                break;
            }
        }
        System.out.println();

        if (a == true) {
            System.out.println("каждое следующее число больше предыдущего");
        } else {
            System.out.println("массив не возрастающий");
        }
    }
}