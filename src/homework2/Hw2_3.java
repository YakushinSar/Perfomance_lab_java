package homework2;

public class Hw2_3 {
    /*
Задача 3:
Составьте программу, выводящую на экран квадраты чисел от 10 до 20
включительно.
     */
    public static void main(String[] args) {
        int kvadrat;
        for (int i = 10; i < 21; i++) {
            kvadrat = i * i;
            System.out.println("квадрат числа " + i + " равен: " + kvadrat);
        }
    }
}
