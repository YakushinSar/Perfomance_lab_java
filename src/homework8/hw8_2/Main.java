package homework8.hw8_2;

public class Main {

    public static void main(String[] args) {
        Animals animal = new Animals();
        animal.addAnimal("Кошка");
        animal.addAnimal("Собака");
        animal.addAnimal("Крокодил");
        System.out.println(animal.animalsList);
        System.out.println();

        animal.deleteAnimal();
        animal.deleteAnimal();
        System.out.println(animal.animalsList);

    }
}
