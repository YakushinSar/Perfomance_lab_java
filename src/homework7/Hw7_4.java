package homework7;

public class Hw7_4 extends MainMethod {
    /*
Задача 4:
Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов. Если таких слов несколько, найти первое из них.
     */
    public static void main(String[] args) {
        String str1 = input("Введите первую строку: ");
        String str2 = input("Введите вторую строку: ");
        String str3 = input("Введите третью строку: ");
        String[] arrayString = {str1, str2, str3};

        String result = null;
        for (String s : arrayString) {
            if (unique(s)) {
                result = s;
                break;
            }
        }

        if (result != null) {
            System.out.println("слово, состоящее только из различных символов: " + result);
        } else {
            System.out.println("Слов нет");
        }
    }

    static boolean unique(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}