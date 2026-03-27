package homework4;

public class Bankomat {

    /*
Задача 2:
Создать класс, описывающий банкомат. Набор купюр, находящихся в
банкомате, должен задаваться тремя свойствами: количеством купюр
номиналом 20, 50 и 100. Сделать метод для добавления денег в банкомат.
Сделать функцию, снимающую деньги, которая принимает сумму денег, а
возвращает булевое значение - успешность выполнения операции. При
снятии денег, функция должна распечатывать каким количеством купюр
какого номинала выдаётся сумма. Создать конструктор с тремя параметрами
-количеством купюр каждого номинала
     */
    int count20;
    int count50;
    int count100;

    public Bankomat(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }

    void replenishment(int count20, int count50, int count100) {
        this.count20 += count20;
        this.count50 += count50;
        this.count100 += count100;
        System.out.println("Деньги добавлены: 20₽ - " + count20 + " шт, 50₽ - " + count50 + " шт, 100₽ - " + count100 + " шт");
    }

    boolean withdrawal(int amount) {
        int remaining = amount;
        int needed100 = 0;
        int needed50 = 0;
        int needed20 = 0;

        needed100 = Math.min(remaining / 100, count100);
        remaining -= needed100 * 100;

        needed50 = Math.min(remaining / 50, count50);
        remaining -= needed50 * 50;

        needed20 = Math.min(remaining / 20, count20);
        remaining -= needed20 * 20;

        if (remaining != 0) {
            System.out.println("Недостаточно купюр для выдачи суммы " + amount);
            return false;
        }

        if (needed100 > 0) {
            System.out.println("выдано номинала 100₽ — " + needed100 + " шт");
        }
        if (needed50 > 0) {
            System.out.println("выдано номинала 50₽ — " + needed50 + " шт");
        }
        if (needed20 > 0) {
            System.out.println("выдано номинала 20₽ — " + needed20 + " шт");
        }

        count100 -= needed100;
        count50 -= needed50;
        count20 -= needed20;

        System.out.println("Сумма " + amount + " выдана успешно.");
        return true;
    }

    void showBalance() {
        int total = count20 * 20 + count50 * 50 + count100 * 100;
        System.out.println("В банкомате: 20₽ - " + count20 + " шт, 50₽ - " + count50 + " шт, 100₽ - " + count100 + " шт. Всего: " + total + "₽");
    }

    public static void main(String[] args) {
        Bankomat b = new Bankomat(5, 5, 5);
        b.showBalance();
        b.replenishment(3, 3, 3);
        b.showBalance();
        System.out.println();
        b.withdrawal(370);
        b.showBalance();
    }
}
