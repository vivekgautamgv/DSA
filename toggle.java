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

      
        System.out.println(count);
    }
}

