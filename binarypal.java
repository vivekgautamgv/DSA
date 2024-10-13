import java.util.Scanner;

public class binarypal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        System.out.print(Palindrome(x));

    }

    public static boolean Palindrome(int N){
        String str = Integer.toString(N);
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)){
            return false;
            }
        i++;
        j--;
        }
        return true;
    }
}
