package tasks;

public class Task2 {
    public static void main(String[] args) {
        int score = 100;

        if (score >= 90) {
            System.out.println("Great");
        } else if (score >= 80) {
            System.out.println("Good");
        } else if (score >= 70) {
            System.out.println("Not bad");
        } else {
            System.out.println("Bad");
        }

        String day = "Monday";

        switch (day) {
            case "Monday":
                System.out.println("Start of work weak");
                break;

            case "Пятница":
                System.out.println("End of work weak");
                break;

            default:
                System.out.println("Basic day");
                break;
        }
    }
}
