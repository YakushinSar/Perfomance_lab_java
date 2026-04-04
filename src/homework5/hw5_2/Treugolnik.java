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
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double perimetr() {
        return a + b + c;
    }
}