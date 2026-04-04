package homework5.hw5_2;

class Krug extends Figura {

    double radius;

    public Krug(double radius) {
        this.radius = radius;
    }

    @Override
    public double ploshad() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimetr() {
        return 2 * Math.PI * radius;
    }
}
