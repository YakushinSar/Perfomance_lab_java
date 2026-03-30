package homework5;

class Terapevt extends Doctor {

    @Override
    void lechit() {
        System.out.println("Терапевт назначает лечение");
    }

    void naznachitVracha(Pacient pacient) {
        if (pacient.getPlanLechenia() == 1) {
            pacient.setDoctor(new Hirurg());
        } else if (pacient.getPlanLechenia() == 2) {
            pacient.setDoctor(new Dantist());
        } else {
            pacient.setDoctor(new Terapevt());
        }
        System.out.print("Пациент с планом лечения " + pacient.getPlanLechenia() + ": ");
        pacient.getDoctor().lechit();
    }
}
