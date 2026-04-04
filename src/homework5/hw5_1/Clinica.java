package homework5.hw5_1;

public class Clinica {

    public static void main(String[] args) {
        Pacient p1 = new Pacient(1);
        Pacient p2 = new Pacient(2);
        Pacient p3 = new Pacient(3);

        Terapevt t = new Terapevt();
        t.naznachitVracha(p1);
        t.naznachitVracha(p2);
        t.naznachitVracha(p3);
    }
}