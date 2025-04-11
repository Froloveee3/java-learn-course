package tasks.Task6;

public class Task6 {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);
        Student student = new Student("Jane Smith", 20, "Computer Science");
        Employee employee = new Employee("Bob Johnson", 40, "Google");

        Person[] people = new Person[3];
        people[0] = person;
        people[1] = student;
        people[2] = employee;

        for (Person p : people) {
            p.introduce();
            System.out.println();
        }
    }
}
