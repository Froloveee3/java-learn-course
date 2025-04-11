package tasks;

public class Task4 {
    public static int factorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int max(int a, int b) {
        return (a >= b) ? a : b;
    }

    public static void main(String[] args) {
        int nunFactorial = factorial(5);
        System.out.println("Factorial of 5: " + nunFactorial);

        boolean isPrime = isPrime(17);
        System.out.println("Is 17 a prime number? " + isPrime);
        isPrime = isPrime(16);
        System.out.println("Is 16 a prime number? " + isPrime);

        int maxNum = max(10, 20);
        System.out.println("Max of 10 and 20: " + maxNum);
    }
}
