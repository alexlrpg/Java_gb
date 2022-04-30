public class Person {
    private String full_name;
    private String position;
    private String email;
    private String number;
    private int salary;
    private int age;

    public Person(String full_name, String position, String email, String number, int salary, int age) {
        this.full_name = full_name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public void infoPerson() {
        System.out.println("ФИО:" + full_name + "\n" + "Должность:" + position + "\n" + "Email:" + email +  "\n"  +
                "Номер телефона:" + number +  "\n" + "Зарплата:" + salary +  "\n" + "Возраст:" + age);
    }

    public int getAge() {
        return age;
    }
}