package homework5.hw5_1;

class Pacient {

    private int planLechenia;
    private Doctor doctor;

    public Pacient(int planLechenia) {
        this.planLechenia = planLechenia;
    }

    public int getPlanLechenia() {
        return planLechenia;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }
}
