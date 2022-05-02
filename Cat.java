public class Cat extends Animal {

    static int catCount = 0;
    final int MAX_RUN = 200;

    public Cat(String name) {
        super(name);
        catCount++;
    }
    public static int getAnimalCount() {
        return catCount;
    }

    @Override
    public void run(int a) {
        System.out.println(a > 0 && a <= MAX_RUN ? name + " " + "пробежал" + " " + a + "м" : "Введенное значение не верно");
    }

    @Override
    public void swim(int b) {
        System.out.println(name + " " + "не умеет плавать");
    }
}