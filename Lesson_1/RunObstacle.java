package Lesson_1;

public class RunObstacle extends CourseApp {

    public RunObstacle(int obstacle) {
        super(obstacle);
    }

    @Override
    public void doIt(TeamPerson teamPerson) {
        teamPerson.run(super.getObstacle());
    }
}
