package Lesson_1;

public class SwimObstacle extends CourseApp {

    public SwimObstacle(int obstacle) {
        super(obstacle);
    }

    @Override
    public void doIt(TeamPerson teamPerson) {
        teamPerson.swim(super.getObstacle());
    }
}
