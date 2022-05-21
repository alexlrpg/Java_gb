/**
 * Java 2. Homework 1
 *
 * @author Ekaterina Bataeva
 * @version 21.05.2022
 */

package Lesson_1;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        Random random = new Random();
        TeamPerson[] teamPerson = {
                new TeamPerson("Alex", random.nextInt(13)),
                new TeamPerson("Sid", random.nextInt(13)),
                new TeamPerson("Ben", random.nextInt(13)),
                new TeamPerson("Bill", random.nextInt(13))
        };

        Team team = new Team("Fenix", teamPerson);

        CourseApp[] courseApp = {
                new RunObstacle(10),
                new SwimObstacle(10),
                new JumpObstacle(8)
        };

        Course course = new Course(courseApp);

        course.doIt(team);

        team.showResults();
    }
}
