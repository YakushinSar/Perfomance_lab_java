package homework5.hw5_2;

class Pryamougolnik extends Figura {

    double a, b;

    public Pryamougolnik(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double ploshad() {
        return a * b;
    }

    @Override
    public double perimetr() {
        return (a + b) * 2;
    }
}
