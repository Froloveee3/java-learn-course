package tasks;

public class Task3 {
    public static void main(String[] args) {
        int N = 10;
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        System.out.println("Sum of nums from 1 to " + N + ": " + sum);

        int i = 0;
        System.out.print("Even numbers from 0 to " + N + ": ");
        while (i <= N) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();

        int j = 1;
        System.out.print("Numbers from 1 to 5: ");
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 5);
        System.out.println();

    }
}
