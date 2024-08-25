import java.util.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int input = scanner.nextInt();
        scanner.close(); // Close the scanner to prevent resource leaks

        System.out.println("Factorial of " + input + " is: " + factorial(input));
    }

    /**
     * Calculates the factorial of a given number.
     *
     * @param n the input number
     * @return the factorial of n
     */
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}