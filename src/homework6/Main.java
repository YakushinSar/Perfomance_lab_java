package homework6;

public class Main {

/*
Задача 1:
Создать класс с как минимум 4 разными методами, в каждом методе добавить
проверку на исключительные ситуации, используя:
1. try- catch
2. try-catch, где catch будет несколько
3. try -catch, с использованием multi - catch
4. try-catch-finally
Продемонстрировать обработку исключительных ситуаций на примерах
 */

    /**
     * try- catch
     * Ошибка при делении на ноль
     */
    static void method1(int a, int b) {
        try {
            System.out.println("Результат деления method1 : " + a / b);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль!  " + e);
        }
        System.out.println("Метод работает");
    }

    /**
     * catch будет несколько
     * Ошибка если первое число не четное
     * Ошибка при делении на ноль
     */
    static void method2(int a, int b) {
        try {
            if (a % 2 != 0) {
                throw new IllegalArgumentException("Число нечётное!");
            }
            System.out.println("Результат деления method2 : " + a / b);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль!  " + e);
        } catch (IllegalArgumentException e) {
            System.out.println("Первое передаваемое число не четное  " + e);
        }
    }

    /**
     * с использованием multi - catch
     * ловит ArithmeticException или IllegalArgumentException
     */
    static void method3(int a, int b) {
        try {
            if (a % 2 != 0) {
                throw new IllegalArgumentException("Число нечётное!");
            }
            System.out.println("Результат деления method3: " + a / b);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Ошибка при выполнении:  " + e.getClass().getSimpleName() + " " + e);
        }
    }

    /**
     * finally
     * Ошибка при делении на ноль + finally
     */
    static void method4(int a, int b) {
        try {
            System.out.println("Результат деления method4: " + a / b);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль!  " + e);
        } finally {
            System.out.println("Была хорошая попытка попробовать поделить");
        }
    }

    public static void main(String[] args) {
        method1(10, 2);
        method1(10, 0);
        System.out.println("----------------------");
        method2(4, 2);
        method2(5, 2);
        method2(4, 0);
        System.out.println("----------------------");
        method3(10, 5);
        method3(11, 5);
        method3(10, 0);
        System.out.println("----------------------");
        method4(10, 2);
        method4(10, 0);
    }
}

