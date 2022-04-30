/**
 * Java 1. Homework 5
 *
 * @author Ekaterina Bataeva
 * @version 30.04.2022
 */

public class Lesson5HomeWork {

    public static void main(String[] args) {

        Person[] persArray = new Person[5];

        persArray[0] = new Person(
                "Ivanov Ivan Ivanovich",
                "Engineer",
                "ivanov@gmail.com",
                "89994561223",
                100000,
                30
        );

        persArray[1] = new Person(
                "Petrov Petr Petrovich",
                "Engineer",
                "petrov@gmail.com",
                "89984561111",
                130000,
                35
        );

        persArray[2] = new Person(
                "Petrov Ivan Nikolaevich",
                "Engineer",
                "petrovin@gmail.com",
                "89934561111",
                150000,
                33
        );

        persArray[3] = new Person(
                "Danilov Oleg Olegovich",
                "Engineer",
                "danilov@gmail.com",
                "89516534545",
                180000,
                42
        );

        persArray[4] = new Person(
                "Kouchin Artem Petrovich",
                "Engineer",
                "kouchin@gmail.com",
                "89507894631",
                125000,
                28
        );

        for (Person person : persArray) {
            if (person.getAge() > 40) person.infoPerson();
        }
    }
}
