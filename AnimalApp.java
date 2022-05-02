/**
 * Java 1. Homework 6
 *
 * @author Ekaterina Bataeva
 * @version 02.05.2022
 */

class AnimalApp {

    public static void main(String args[]) {

        Cat cat = new Cat("Барсик");
        cat.run(150);
        cat.swim(150);
        Cat cat1 = new Cat("Мурзик");
        cat1.run(200);
        cat1.swim(0);
        Dog dog = new Dog("Шарик");
        dog.run(500);
        dog.swim(10);
        Dog dog1 = new Dog("Рекс");
        dog1.run(200);
        dog1.swim(1);
        System.out.println("Общее кол-во животных равно" + " " + Animal.getAnimalCount());
        System.out.println("Кол-во котов равно" + " " + Animal.getAnimalCount());
        System.out.println("Кол-во собак равно" + " " + Dog.getAnimalCount());
    }
}
