import java.math.BigInteger;

public class kasturba {

    public static BigInteger karatsuba(BigInteger x, BigInteger y) {
        // Get max length of numbersṇ
        int N = Math.max(x.bitLength(), y.bitLength());
        if (N <= 2000) return x.multiply(y); // Use built-in multiply for small numbers

        N = (N / 2) + (N % 2); // Divide length by 2 and round up

        // x = a + b, y = c + d
        BigInteger b = x.shiftRight(N);
        BigInteger a = x.subtract(b.shiftLeft(N));
        BigInteger d = y.shiftRight(N);
        BigInteger c = y.subtract(d.shiftLeft(N));

        // Compute ac, bd, and (a+b)(c+d)
        BigInteger ac = karatsuba(a, c);
        BigInteger bd = karatsuba(b, d);
        BigInteger abcd = karatsuba(a.add(b), c.add(d));

        // Gauss's trick: (a+b)(c+d) - ac - bd = ad + bc
        BigInteger crossTerms = abcd.subtract(ac).subtract(bd);

        // Final computation: ac * 2^2*N + (ad+bc) * 2^N + bd
        return ac.shiftLeft(2 * N).add(crossTerms.shiftLeft(N)).add(bd);
    }

    public static void main(String[] args) {
        BigInteger x = new BigInteger("12345678901234567890");
        BigInteger y = new BigInteger("98765432109876543210");

        BigInteger result = karatsuba(x, y);
        System.out.println("Result of Karatsuba Multiplication: " + result.toString());
    }
}
