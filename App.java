/**
 * Java 1. Homework 7
 *
 * @author Ekaterina Bataeva
 * @version 05.05.2022
 */

public class App {

    public static void main(String[] args) {
        Cat[] arrCats = new Cat[6];

        arrCats[0] = new Cat("Twiksi", 20);
        arrCats[1] = new Cat("Barsik", 15);
        arrCats[2] = new Cat("Keks", 30);
        arrCats[3] = new Cat("Chivas", 25);
        arrCats[4] = new Cat("Marsik", 35);
        arrCats[5] = new Cat("Vas'ka", 40);

        Plate plate = new Plate(100);

        for (Cat cat : arrCats) {
            cat.eatFood(plate);
            cat.info();
        }

        plate.addFood(50);
    }
}
