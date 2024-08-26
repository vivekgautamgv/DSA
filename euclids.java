import java.util.*;
import java.util.Scanner;


class main {
    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }

        return gcd(b%a,a); 
    }
}
public class euclids {

    public static void main(String args[]){
        
        int n1 = 46;
        int n2 = 23;
        int result = maib.gcd(n1,n2);
        System.out.println("GCD of "+n1+" and "+n2+" is "+result);

    }
    
}
