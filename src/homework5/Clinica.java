package homework5;

/*
Задача 1:
Создать программу для имитации работы клиники. Пусть в клинике будет три
врача: хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но
каждый врач лечит по-своему. Так же предусмотреть класс «Пациент» с полем
«План лечения» и полем «Доктор». Создать объект класса «Пациент» и
добавить пациенту план лечения. У терапевта создать метод, который будет
назначать врача пациенту согласно плану лечения:
Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
Если план лечения имеет код 2 – назначить дантиста и выполнить метод
лечить.
Если план лечения имеет любой другой код – назначить терапевта и
выполнить метод
лечить.
 */
abstract class Doctor {
    abstract void lechit();
}

class Hirurg extends Doctor {
    @Override
    void lechit() {
        System.out.println("Хирург делает операции");
    }
}

class Terapevt extends Doctor {
    @Override
    void lechit() {
        System.out.println("Терапевт назначает лечение");
    }
}

class Dantist extends Doctor {
    @Override
    void lechit() {
        System.out.println("Дантист лечит зубы");
    }
}

class Pacient {
    int planLechenia;
    Doctor doctor;

    public Pacient(int planLechenia) {
        this.planLechenia = planLechenia;
    }

    void naznachitVracha() {
        if (planLechenia == 1) {
            doctor = new Hirurg();
        } else if (planLechenia == 2) {
            doctor = new Dantist();
        } else {
            doctor = new Terapevt();
        }
        System.out.print("Пациент с планом лечения" + planLechenia + ": ");
        doctor.lechit();
    }
}

class Clinica {
    public static void main(String[] args) {
        Pacient p1 = new Pacient(1);
        Pacient p2 = new Pacient(2);
        Pacient p3 = new Pacient(3);
        p1.naznachitVracha();
        p2.naznachitVracha();
        p3.naznachitVracha();
    }
}


