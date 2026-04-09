package homework8.hw8_2;

import java.util.LinkedList;

public class Animals {

    /*
Задача 2:
Создать класс, который будет хранить в себе коллекцию с названиями животных. Реализовать методы удаления и добавления
 животных по следующим правилам: добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
  объекта этого класса в main методе другого класса.
     */
    LinkedList<String> animalsList = new LinkedList<>();

    void addAnimal(String animal) {
        animalsList.addFirst(animal);
        System.out.println("Добавлено: " + animal);
    }

    void deleteAnimal() {
        if (animalsList.isEmpty()) {
            System.out.println("Нечего удалять");
        } else {
            System.out.println("Удалено: " + animalsList.removeLast());
        }
    }
}
