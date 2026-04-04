package homework7;

public class Hw7_3 extends MainMethod {
    /*
Задача 3:
Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше средней, а также их длину
     */
    public static void main(String[] args) {
        String str1 = input("Введите первую строку: ");
        String str2 = input("Введите вторую строку: ");
        String str3 = input("Введите третью строку: ");
        String[] arrayString = {str1, str2, str3};

        int sumLength = 0;
        for (String s : arrayString) {
            sumLength += s.length();
        }

        int sredn = sumLength / arrayString.length;
        for (String s : arrayString) {
            if (s.length() < sredn) {
                System.out.println(s.concat(" длина меньше средней, её длина: ").concat(String.valueOf(s.length())));
            }
        }
    }
}
