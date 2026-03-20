package homework3;

import java.util.Scanner;

public class Hw3_4 {

    /*
Задача 4:
Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
вывести сообщение, что их нет.
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
//        int[] arr = {1, 2, 3, 4, 5, 0, 0, 0, 8, 7, 6};

        int kolichestvo = 0;
        for (int value : arr) {
            if (value == 0) {
                kolichestvo++;
            }
        }
        System.out.println();
        
        if (kolichestvo == 0) {
            System.out.println("нулевых элементов нет");
        } else {
            System.out.println("Количество нулевых элементов: " + kolichestvo);
        }
    }
}
