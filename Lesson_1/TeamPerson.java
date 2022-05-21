package Lesson_1;

public class TeamPerson {

    private String name;

    private int power;

    boolean done;

    public TeamPerson(String name, int power) {
        this.name = name;
        this.power = power;
        this.done = false;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public boolean isDone() {
        return done;
    }

    public void run (int courseObstacle) {
        if (power >= courseObstacle) {
            done = true;
            System.out.println(name + " " + "пробежал дистанцию");
        } else {
            done = false;
            System.out.println(name + " " + "не преодолел дистанцию");
        }
    }

    public void swim (int courseObstacle) {
        if (power >= courseObstacle) {
            done = true;
            System.out.println(name + " " + "проплыл дистанцию");
        } else {
            done = false;
            System.out.println(name + " " + "не проплыл дистанцию");
        }
    }

    public void jump (int courseObstacle) {
        if (power >= courseObstacle) {
            done = true;
            System.out.println(name + " " + "перепрыгнул препятствие");
        } else {
            done = false;
            System.out.println(name + " " + "не перепрыгнул препятствие");
        }
    }
}
