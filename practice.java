import java.util.*;
import java.util.Scanner;

public class practice {

    public static void main(String args[]){

    Scanner scanner  = new Scanner(System.in);
    int n = scanner.nextInt();
    boolean pri[] = new boolean[n+1];

    for(int i=0;i<=n;i++){
        pri[i] = true;
    }
    
    for(int i=2;i<=n;i++){
        if(pri[i] == true){
            for(int j=i*i;j<=n;j+=i){
                pri[j] = false;

    }
    }

   }

   
   for(int i = 0;i<=n;i++){
      if(pri[i]){
        System.out.print(i);
      }
   }

    }

}