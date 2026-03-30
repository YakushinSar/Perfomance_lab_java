package homework4;

public class CreditCard {

    /*
Задача 1:
Создать класс CreditCard c полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке. Напишите
программу, которая создает три объекта класса CreditCard у которых заданы
номер счета и начальная сумма.
Тестовый сценарий для проверки: Положите деньги на первые две карточки и
снимите с третьей. Выведите на экран текущее состояние всех трех карточек.
     */
    int checkNumber;
    int accountBalance;

    void replenishment(int sum) {
        accountBalance += sum;
        System.out.println("счет: " + checkNumber + " пополнен на " + sum + " рублей");
    }

    void withdrawal(int sum) {
        if (accountBalance < sum) {
            System.out.println("недостаточно средств на счете");
            return;
        }
        accountBalance -= sum;
        System.out.println("со счета: " + checkNumber + " снято " + sum + " рублей");
    }

    void cardInfo() {
        System.out.println("на карте " + checkNumber + " текущий баланс составляет " + accountBalance + " рублей");
    }

    public CreditCard(int checkNumber, int accountBalance) {
        this.checkNumber = checkNumber;
        this.accountBalance = accountBalance;
    }

    public static void main(String[] args) {
        CreditCard c1 = new CreditCard(12345, 100);
        CreditCard c2 = new CreditCard(67891, 500);
        CreditCard c3 = new CreditCard(11223, 1000);

        c1.replenishment(100);
        c2.replenishment(1000);
        c3.withdrawal(500);

        c1.cardInfo();
        c2.cardInfo();
        c3.cardInfo();
    }
}
