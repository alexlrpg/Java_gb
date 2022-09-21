package lesson_3_2;

public class Box <T extends Fruit> {

    private T fruits;
    private int fruitCount;

    public Box (T fruits, int fruitCount) {
        this.fruits = fruits;
        this.fruitCount = fruitCount;
    }

    public T getFruits() {
        return fruits;
    }

    public void addFruit(int num) {
        fruitCount += num;
    }

    private float getWeight() {
        float weight = fruitCount * fruits.getWeight();
        return weight;
    }

    public boolean compare(Box<?> another) {
        return this.getWeight() == another.getWeight();
    }

}