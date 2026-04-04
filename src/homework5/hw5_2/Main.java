package homework5.hw5_2;

public class Main {

    public static void main(String[] args) {
        Figura[] figura = new Figura[5];
        figura[0] = new Treugolnik(10, 20, 30);
        figura[1] = new Pryamougolnik(5, 6);
        figura[2] = new Krug(9);
        figura[3] = new Pryamougolnik(7, 8);
        figura[4] = new Krug(19);

        double sumPerimetr = 0;
        for (Figura f : figura) {
            sumPerimetr = sumPerimetr + f.perimetr();
        }
        System.out.println("сумма периметров = " + Math.round(sumPerimetr));
    }
}
