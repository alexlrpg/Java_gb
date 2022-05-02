public abstract class Animal {

    String name;
    static int animalCount = 0;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }
    public static int getAnimalCount() {
        return animalCount;
    }

    public abstract void run(int a);

    public abstract void swim(int b);

}
