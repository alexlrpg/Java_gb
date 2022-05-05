public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean looseFood(int appetite) {
        if ((food - appetite) > 0) {
            food -= appetite;
            return true;
        } else {
            return false;
        }
    }

    public void addFood(int food) {
        this.food += food;
        System.out.println("Food added, total food:" + " " + food);
    }

    public int getFood() {
        return food;
    }
}
