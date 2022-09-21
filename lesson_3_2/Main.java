package lesson_3_2;

public class Main {

    public static void main(String[] args) {
        Apple apples = new Apple();
        Box<Apple> box1 = new Box<>(apples, 3);

        Orange oranges = new Orange();
        Box<Orange> box2 = new Box<>(oranges, 2);

        System.out.println(box1.compare(box2));
    }
}