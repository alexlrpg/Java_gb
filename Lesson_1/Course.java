package Lesson_1;

public class Course {

    CourseApp[] courseApp;

    public Course(CourseApp ... courseApp) {
        this.courseApp = courseApp;
    }

    public CourseApp[] getCourseApp() {
        return courseApp;
    }

    public void doIt(Team team){
        for (TeamPerson t : team.getTeamPerson()) {
            for (CourseApp c: courseApp) {
                c.doIt(t);
                if (!t.isDone()) {
                    break;
                }
            }
        }
    }
}

