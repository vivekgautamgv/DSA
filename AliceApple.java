import java.util.*;

public class AliceApple {
    static int minApples(int M, int K, int S, int W, int E, int N) {
        if (M <= S * K) {
            return M;
        } else if (M <= S * K + E + W) {
            return (S * K + (M - S * K));
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int M = 10;
        int K = 15;
        int S = 1;
        int W = 0;
        int E = 0;
        int N = 0;
        int ans = minApples(M, K, S, W, E, N);
        System.out.println("answer : " + ans);
    }
}