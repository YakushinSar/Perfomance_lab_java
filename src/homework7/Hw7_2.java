package homework7;

public class Hw7_2 extends MainMethod {
    /*
Задача 2:
Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания значений их длины.
     */
    public static void main(String[] args) {
        String str1 = input("Введите первую строку: ");
        String str2 = input("Введите вторую строку: ");
        String str3 = input("Введите третью строку: ");
        String[] arrayString = {str1, str2, str3};

        for (int i = 0; i < arrayString.length - 1; i++) {
            for (int j = i + 1; j < arrayString.length; j++) {
                if (arrayString[i].length() > arrayString[j].length()) {
                    String temp = arrayString[i];
                    arrayString[i] = arrayString[j];
                    arrayString[j] = temp;
                }
            }
        }
        for (String s : arrayString) {
            System.out.println(s.concat(" длина: ").concat(String.valueOf(s.length())));
        }
    }
}
