package homework5.hw5_2;

public class Treugolnik extends Figura {

    double a, b, c;

    public Treugolnik(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double ploshad() {
        return (a + b + c) / 2;
    }

    @Override
    public double perimetr() {
        return a + b + c;
    }
}