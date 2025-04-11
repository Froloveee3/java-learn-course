package tasks.Task6;

public class Student extends Person {
    private String course;

    public Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I am studying " + course + ".");
    }
}

