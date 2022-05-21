package Lesson_1;

public class JumpObstacle extends CourseApp {

    public JumpObstacle(int obstacle) {
        super(obstacle);
    }

    @Override
    public void doIt(TeamPerson teamPerson) {
        teamPerson.jump(super.getObstacle());
    }
}
