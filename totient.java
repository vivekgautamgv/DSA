public class totient{
    static final int N = (int) 1e5 + 2;
    static final int MOD = (int) 1e9 + 7;
    static long[] totient = new long[N];

    public static void main(String[] args) {
        for (int i = 0; i < N; i++) {
            totient[i] = i;
        }

        for (int i = 2; i < N; i++) {
            if (totient[i] == i) {

                for (int j = 2 * i; j < N; j += i) {

                    totient[j] *= i - 1;
                    totient[j] /= i;
                }

                totient[i] = i - 1;
            }
        }

        for (int i = 2; i < 11; i++) {
            System.out.print(totient[i] + " ");
        }
    }
}