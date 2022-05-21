package Lesson_1;

public abstract class CourseApp {

    private String courseName;

    private int obstacle;

    CourseApp(int obstacle) {
        this.obstacle = obstacle;
    }

    public int getObstacle() {
        return obstacle;
    }

    public abstract void doIt(TeamPerson teamPerson);
}
