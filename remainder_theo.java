import java.util.*;
import java.util.Scanner;

public class remainder_theo {

    static int CRT(int a[], int m[], int n , int p){
        int x = 0;
        for(int i=0;i<n;i++){
            int M = p/m[i];
            int y= 0;
            for(int j = 0; j<m[i];j++){

                if((M*j)%m[i] == 1){

                    y=j;
                    break;

                }
            }

            x = x + a[i]*M*y;
        }

        return x%p;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of congruence relations: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the values of a (remainders): ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        int m[] = new int[size];
        int p = 1;
        System.out.println("Enter the values of m (moduli): ");
        for (int i = 0; i < size; i++) {
            m[i] = sc.nextInt();
            p = p * m[i];
        }
        System.out.println("The solution is " + CRT(a, m, size, p));
    }
}
