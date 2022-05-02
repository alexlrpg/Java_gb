public class Dog extends Animal {

    static int dogCount = 0;
    final int MAX_RUN = 500;
    final int MAX_SWIM = 10;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public static int getAnimalCount() {
        return dogCount;
    }

    @Override
    public void run(int a) {
        System.out.println(a > 0 && a <= MAX_RUN ? name + " " + "пробежал" + " " + a + "м" : "Введенное значение не верно");
    }

    @Override
    public void swim(int b) {
        System.out.println(b > 0 && b <= MAX_SWIM ? name + " " + "проплыл" + " " + b + "м" : "Введенное значение не верно");
    }
}