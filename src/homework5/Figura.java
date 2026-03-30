package homework5;

/*
Задача 2:
Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
Реализовать функцию подсчета площади для каждого типа фигуры и подсчет
периметра(используя абстрактный класс/методы). Создать массив из 5 разных
фигур. Вывести на экран сумму периметра всех фигур в массиве
 */
interface Ploshad {
    double ploshad();
}

interface Perimetr {
    double perimetr();
}

abstract class Figura implements Ploshad, Perimetr {
}

class Treugolnik extends Figura {
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

class Krug extends Figura {
    double radius;

    public Krug(double radius) {
        this.radius = radius;
    }

    @Override
    public double ploshad() {
        return 3.14 * radius * radius;
    }

    @Override
    public double perimetr() {
        return 2 * 3.14 * radius;
    }
}

class Test1 {
    public static void main(String[] args) {
        Figura[] figura = new Figura[5];
        figura[0] = new Treugolnik(1, 2, 3);
        figura[1] = new Pryamougolnik(4, 5);
        figura[2] = new Krug(6);
        figura[3] = new Pryamougolnik(7, 8);
        figura[4] = new Krug(9);

        double sumPerimetr = 0;
        for (Figura f : figura) {
            sumPerimetr = sumPerimetr + f.perimetr();
        }
        System.out.println(sumPerimetr);
    }
}