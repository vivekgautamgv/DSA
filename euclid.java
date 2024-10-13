import java.util.Scanner;

public class euclid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = scan.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = scan.nextInt();
        
        int g = gcd(n1, n2);
        System.out.print(g);
    }

    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}