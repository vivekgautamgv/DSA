import java.util.*;
import java.util.Scanner;

public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i * i <= n; i++) {
            count++;
        }

        // Calculate the number of perfect squares up to n      (OR SIMPLY)
        int openDoorsCount = (int) Math.sqrt(n);
        
        System.out.println(count);
    }
}

